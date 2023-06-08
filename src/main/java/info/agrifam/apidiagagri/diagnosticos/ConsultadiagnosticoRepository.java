package info.agrifam.apidiag.diagnosticos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultadiagnosticoRepository extends JpaRepository<Consultadiagnostico, Integer> {
    List<Consultadiagnostico> findAllByMunidIn(List<Integer> argids);
}