package info.agrifam.apidiag.userprojetos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projetousuario")
public class ProjetosUsuarioController {

  private final  ProjetosUsuarioRepository  projetosUsuarioRepository;
    public ProjetosUsuarioController(ProjetosUsuarioRepository projetosUsuarioRepository){
        this.projetosUsuarioRepository = projetosUsuarioRepository;
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
    public List<ProjetosUsuario> Get(@PathVariable(value = "login") String login){
        List<ProjetosUsuario>  all =  projetosUsuarioRepository.findAllByLogin(login);
        return   all;
    }
}
