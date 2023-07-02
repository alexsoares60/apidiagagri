package info.agrifam.apidiagagri.service;


import info.agrifam.apidiagagri.dto.ProductInfoDTO;
import info.agrifam.apidiagagri.dto.ProductSaleDTO;
import info.agrifam.apidiagagri.dto.SaleDTO;
import info.agrifam.apidiagagri.dto.SaleInfoDTO;
import info.agrifam.apidiagagri.entity.ItemSale;
import info.agrifam.apidiagagri.entity.Product;
import info.agrifam.apidiagagri.entity.Sale;
import info.agrifam.apidiagagri.entity.User;
import info.agrifam.apidiagagri.exceptions.InvalidOperationException;
import info.agrifam.apidiagagri.exceptions.NoItemException;
import info.agrifam.apidiagagri.repository.ItemSaleRepository;
import info.agrifam.apidiagagri.repository.ProductRepository;
import info.agrifam.apidiagagri.repository.SaleRepository;
import info.agrifam.apidiagagri.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SaleService {

    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final SaleRepository saleRepository;
    private final ItemSaleRepository itemSaleRepository;

    /*
    {
        "user": "Fulano",
        "data": "03/07/2022"
        "products":[
            {
                "description": "Notebook dell",
                "quantity": 1
            }
        ]
    }
     */

    public List<SaleInfoDTO> findAll(){
        return saleRepository.findAll().stream().map(sale -> getSaleInfo(sale)).collect(Collectors.toList());
    }

    private SaleInfoDTO getSaleInfo(Sale sale) {
        return SaleInfoDTO.builder()
                .user(sale.getUser().getName())
                .date(sale.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                .products(getProductInfo(sale.getItems()))
                .build();
    }

    private List<ProductInfoDTO> getProductInfo(List<ItemSale> items) {

        if(CollectionUtils.isEmpty(items)){
            return Collections.emptyList();
        }

        return items.stream().map(
                item -> ProductInfoDTO
                        .builder()
                        .id(item.getId())
                        .description(item.getProduct().getDescription())
                        .quantity(item.getQuantity()).build()
        ).collect(Collectors.toList());
    }

    @Transactional
    public long save(SaleDTO sale){
        User user = userRepository.findById(sale.getUserid())
                .orElseThrow(() -> new NoItemException("Usuário não encontrado!"));

        Sale newSale = new Sale();
        newSale.setUser(user);
        newSale.setDate(LocalDate.now());
        List<ItemSale> items = getItemSale(sale.getItems());

        newSale = saleRepository.save(newSale);

        saveItemSale(items, newSale);

        return newSale.getId();
    }



    private void saveItemSale(List<ItemSale> items, Sale newSale) {
        for (ItemSale item: items){
            item.setSale(newSale);
            itemSaleRepository.save(item);
        }
    }

    private List<ItemSale> getItemSale(List<ProductSaleDTO> products) {

        if(products.isEmpty()){
            throw new InvalidOperationException("Não possível adicionar a venda sem itens!");
        }

        return products.stream().map(item -> {
            Product product = productRepository.findById(item.getProductid())
                    .orElseThrow(()-> new NoItemException("Item da venda não encontrado"));

            ItemSale itemSale = new ItemSale();
            itemSale.setProduct(product);
            itemSale.setQuantity(item.getQuantity());

            if(product.getQuantity() == 0){
                throw new NoItemException("Produto sem estoque.");
            } else if(product.getQuantity() < item.getQuantity()){
                throw new InvalidOperationException(
                        String.format("A quantidade de itens da venda (%s) " +
                                "é maior do que a quantidade disponível no estoque (%s", item.getQuantity(), product.getQuantity()));
            }

            int total = product.getQuantity() - item.getQuantity();
            product.setQuantity(total);
            productRepository.save(product);

            return itemSale;
        }).collect(Collectors.toList());
    }

    public SaleInfoDTO getById(long id) {
        Sale sale = saleRepository.findById(id)
                .orElseThrow(()-> new NoItemException("Venda não encontrada!"));

        return getSaleInfo(sale);
    }
}
