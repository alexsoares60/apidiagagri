package info.agrifam.apidiag.usoagua;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AterpecusudaaguaRepository extends JpaRepository<Aterpecusudaagua, Integer> {
//    List<Aterpecusudaagua> findAllIdcaracterizacaoupf(Integer argcaracterizacao);

    List<Aterpecusudaagua> findAllByIdcaracterizacaoupf(Integer idcaracterizacaoupf);
}