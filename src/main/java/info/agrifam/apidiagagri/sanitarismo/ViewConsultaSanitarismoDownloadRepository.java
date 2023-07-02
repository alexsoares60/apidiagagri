package info.agrifam.apidiagagri.sanitarismo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewConsultaSanitarismoDownloadRepository extends JpaRepository<ViewConsultaSanitarismoDownload, Integer> {
    List<ViewConsultaSanitarismoDownload> findByLoginDownload(String loginDownload);
}