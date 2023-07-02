package info.agrifam.apidiagagri.produtos;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/produtosdestinacao")

public class ProdutoDestinacaoController {
//
//
////    public String home(){
////    return "chegou no controller produtos destinacao";
////}
//
    private final ProdutosdestinacaoRepository produtoDestinacaoRepository;
    private final ProdutosdestinacaoMapper produtosdestinacaoMapper;

    public ProdutoDestinacaoController(ProdutosdestinacaoRepository produtoDestinacaoRepository, ProdutosdestinacaoMapper produtosdestinacaoMapper) {
        this.produtoDestinacaoRepository = produtoDestinacaoRepository;
        this.produtosdestinacaoMapper = produtosdestinacaoMapper;
    }
    @GetMapping()
    public List<Produtosdestinacao> Get(){

        return produtoDestinacaoRepository.findAll( );

    }
    @PostMapping()
    public ProdutosdestinacaoDto save(@RequestBody ProdutosdestinacaoDto produtosdestinacaoDto) {

        Produtosdestinacao produtosdestinacao =  produtosdestinacaoMapper.toEntity(produtosdestinacaoDto);
        return produtosdestinacaoMapper.toDto(produtoDestinacaoRepository.save(produtosdestinacao));
    }
    @PostMapping("/alterar")
    public ProdutosdestinacaoDto update(@RequestBody  ProdutosdestinacaoDto produtosdestinacaoDto) {
        if (produtosdestinacaoDto.getId() == null) {
            throw new IllegalArgumentException("Produtos destinacao ID não nula, faça um novo lançamento");

        }
       Produtosdestinacao produtosdestinacao =  produtoDestinacaoRepository.findById(produtosdestinacaoDto.getId()).orElseThrow();
//
            Produtosdestinacao produtosdestinacao1 = produtosdestinacaoMapper.partialUpdate(produtosdestinacaoDto, produtosdestinacao);
            return produtosdestinacaoMapper.toDto(produtoDestinacaoRepository.save(produtosdestinacao1));

////        Produtosdestinacao produtosdestinacao1 = produtosdestinacaoMapper.partialUpdate(produtosdestinacaoDto, produtosdestinacao);
//
//
    }
//
//
}
