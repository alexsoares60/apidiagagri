package info.agrifam.apidiagagri.identificacaoupf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/identificacaoproduto")
public class IdentificacaoProdutoController {

    private final ViewIdentificacaoupfprodutoRepository viewIdentificacaoupfprodutoRepository;

    public IdentificacaoProdutoController(IdentificacaoprodutoRepository identificacaoprodutoRepository, ViewIdentificacaoupfprodutoRepository viewIdentificacaoupfprodutoRepository) {
        this.viewIdentificacaoupfprodutoRepository = viewIdentificacaoupfprodutoRepository;
    }
    @GetMapping("/upf/{idupf}")
    public List<ViewIdentificacaoupfproduto> GetIdentificacaoProduto(@PathVariable(value = "idupf") Integer idupf){
        if (idupf == null) {
            throw new IllegalArgumentException("Identificacao ID  nula, ");

        }
        return viewIdentificacaoupfprodutoRepository.findByIdupf(idupf);}
}
