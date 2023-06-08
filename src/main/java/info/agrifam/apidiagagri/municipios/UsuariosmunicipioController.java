package info.agrifam.apidiag.municipios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuariomunicipio")
public class UsuariosmunicipioController {

    private final UsuariosmunicipioRepository usuariosmunicipioRepository;

    public UsuariosmunicipioController(UsuariosmunicipioRepository usuariosmunicipioRepository) {
        this.usuariosmunicipioRepository = usuariosmunicipioRepository;
    }

    @GetMapping("/user/{login}")
    public List<Usuariosmunicipio> GetCaracterizacao(@PathVariable(value = "login") String login){
        return usuariosmunicipioRepository.findByLogin(login);
    }
}
