package info.agrifam.apidiagagri.usoagua;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewconsultausoaguaRepository extends JpaRepository<Viewconsultausoagua, Integer> {
    List<Viewconsultausoagua> findByLogindownload(String logindownload);
}