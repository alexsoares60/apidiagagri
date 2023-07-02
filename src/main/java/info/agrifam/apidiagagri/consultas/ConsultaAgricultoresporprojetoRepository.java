package info.agrifam.apidiagagri.consultas;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ConsultaAgricultoresporprojetoRepository extends JpaRepository<ConsultaAgricultoresporprojeto, Long> {
    Optional<List<ConsultaAgricultoresporprojeto>> findByIdprojeto(Integer id);

    Optional<List<ConsultaAgricultoresporprojeto>> findByLoginDownload(String logindownload);
//    Optional<ConsultaAgricultoresporprojeto> findByIdprojeto(Integer id);
}