package info.agrifam.apidiagagri.projetoequipe;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projetotipofuncao")
public class ProjetotipofuncaoController {

    private final ProjetosequipetipofuncaoRepository projetosequipetipofuncaoRepository;

    public ProjetotipofuncaoController(ProjetosequipetipofuncaoRepository projetosequipetipofuncaoRepository) {
        this.projetosequipetipofuncaoRepository = projetosequipetipofuncaoRepository;
    }

    @GetMapping()
    public List<Projetosequipetipofuncao> Get(){

        return projetosequipetipofuncaoRepository.findAll( );

    }
}
