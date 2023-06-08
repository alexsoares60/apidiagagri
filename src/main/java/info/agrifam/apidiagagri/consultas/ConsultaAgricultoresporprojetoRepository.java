package info.agrifam.apidiag.consultas;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ConsultaAgricultoresporprojetoRepository extends JpaRepository<ConsultaAgricultoresporprojeto, Long> {
    Optional<List<ConsultaAgricultoresporprojeto>> findByIdprojeto(Integer id);
//    Optional<ConsultaAgricultoresporprojeto> findByIdprojeto(Integer id);
}