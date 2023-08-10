package info.agrifam.apidiagagri.identificacaoupf;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IdentificacaoupfRepository extends JpaRepository<Identificacaoupf, Integer> {
    Optional<Identificacaoupf> findByIdcaracterizacaoupfAndMunidAndIdpessoa(Integer idcaracterizacaoupf, Integer munid, Integer idpessoa);

    boolean existsByIdcaracterizacaoupfAndMunidAndIdpessoa(Integer idcaracterizacaoupf, Integer munid, Integer idpessoa);
}