package info.agrifam.apidiagagri.userprojetos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultaProjetosUsuariosProjetoRepository extends JpaRepository<ConsultaProjetosUsuariosProjeto, Integer> {
    List<ConsultaProjetosUsuariosProjeto> findAllByLogin(String login);
}