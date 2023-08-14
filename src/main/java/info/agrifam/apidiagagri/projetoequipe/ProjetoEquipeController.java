package info.agrifam.apidiagagri.projetoequipe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projetoequipe")
public class ProjetoEquipeController {

    private final ProjetosequipepessoaRepository projetosequipepessoaRepository;

    public ProjetoEquipeController(ProjetosequipepessoaRepository projetosequipepessoaRepository) {
        this.projetosequipepessoaRepository = projetosequipepessoaRepository;
    }

    @GetMapping()
    public List<Projetosequipepessoa> Get(){

        return projetosequipepessoaRepository.findAll( );

    }
}
