package info.agrifam.apidiagagri.municipios;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MunicipioComunidadesRepository extends JpaRepository<MunicipioComunidades, Long> {

    List<MunicipioComunidades> findAllBymunidIn(List<Long> Ids, Sort sort) ;

}
