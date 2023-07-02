package info.agrifam.apidiagagri.areasprodutivas;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewareasprodutivaRepository extends JpaRepository<Viewareasprodutiva, Integer> {
    List<Viewareasprodutiva> findByLogindownload(String logindownload);
}