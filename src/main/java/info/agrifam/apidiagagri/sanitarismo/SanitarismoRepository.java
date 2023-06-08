package info.agrifam.apidiag.sanitarismo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SanitarismoRepository extends JpaRepository<Sanitarismo, Integer> {
//    List<Sanitarismo> findAllByIdcaracterizacaoupf(Integer idcaracterizacaoupf);

    List<Sanitarismo> findAllByIdupf(Integer idupf);
}