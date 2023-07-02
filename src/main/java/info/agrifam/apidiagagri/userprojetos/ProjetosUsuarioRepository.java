package info.agrifam.apidiagagri.userprojetos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjetosUsuarioRepository extends JpaRepository<ProjetosUsuario, Integer> {
    List<ProjetosUsuario> findAllByIdprojeto(Integer idprojeto);

    List<ProjetosUsuario> findAllByLogin(String login);
}