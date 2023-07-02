package info.agrifam.apidiagagri.diagnosticos;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface CaracterizacaoRepository extends JpaRepository<Caracterizacao, Integer> {
    Optional<Caracterizacao> findByDtcaracterizacaoupfAndIdpessoachefefamilia(@NotNull LocalDate dtcaracterizacaoupf, @NotNull Integer idpessoachefefamilia);

}