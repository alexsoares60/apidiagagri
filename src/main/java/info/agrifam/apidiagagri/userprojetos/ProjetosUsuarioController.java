package info.agrifam.apidiagagri.userprojetos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projetousuario")
public class ProjetosUsuarioController {

  private final  ProjetosUsuarioRepository  projetosUsuarioRepository;
  private final ConsultaProjetosUsuariosProjetoRepository consultaProjetosUsuariosProjetoRepository;
    public ProjetosUsuarioController(ProjetosUsuarioRepository projetosUsuarioRepository, ConsultaProjetosUsuariosProjetoRepository consultaProjetosUsuariosProjetoRepository){
        this.projetosUsuarioRepository = projetosUsuarioRepository;
        this.consultaProjetosUsuariosProjetoRepository = consultaProjetosUsuariosProjetoRepository;
    };

    @GetMapping
    public List<ProjetosUsuario> Get(){
        List<ProjetosUsuario>  all =  projetosUsuarioRepository.findAll();
      return   all;
    }
    @GetMapping("/{idprojeto}")
    public List<ProjetosUsuario> Get(@PathVariable(value = "idprojeto") Integer idprojeto){
        List<ProjetosUsuario>  all =  projetosUsuarioRepository.findAllByIdprojeto(idprojeto);
        return   all;
    }
    @GetMapping("/login/{login}")
    public List<ConsultaProjetosUsuariosProjeto> Get(@PathVariable(value = "login") String login){
        List<ConsultaProjetosUsuariosProjeto>  all =  consultaProjetosUsuariosProjetoRepository.findAllByLogin(login);
        return   all;
    }
}
