package info.agrifam.apidiagagri.consultas;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ConsultamembrosfamiliaRepository extends JpaRepository<Consultamembrosfamilia, String> {
    Optional<List<Consultamembrosfamilia>> findByIdpessoa(Integer id);
}