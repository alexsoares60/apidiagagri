package info.agrifam.apidiagagri.produtos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/v1/produtosprojetos")
public class ConsultaProdutosProjetosController {
    private final ProdutosProjetoRepository produtosProjetoRepository;

    public ConsultaProdutosProjetosController(ProdutosProjetoRepository produtosProjetoRepository) {
        this.produtosProjetoRepository = produtosProjetoRepository;
    }
    @GetMapping()
    public List<ProdutosProjeto> Get(){

        return produtosProjetoRepository.findAll( );

    }
    @GetMapping("/{id}")
    public Optional<List<ProdutosProjeto>> GetById(@PathVariable(value = "id") Integer id) {
        Optional<List<ProdutosProjeto>> produtosProjeto = produtosProjetoRepository.findByIdprojeto(id);
        if (produtosProjeto.isPresent()) {
            return produtosProjetoRepository.findByIdprojeto(id);
        }


        return produtosProjeto;
    }

    @GetMapping("/ids/{argids}")
    public ResponseEntity<List<ProdutosProjeto>> getProdutosProjeto(@PathVariable("argids") String argids){
        List<Integer> Ids = Stream.of(argids.split(","))
                .map(String::trim)
                .map(Integer::parseInt).toList();
        return ResponseEntity.ok(produtosProjetoRepository.findByIdprojetoIn(Ids));
    }}
