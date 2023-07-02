package info.agrifam.apidiagagri.areaconhecimento;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewconsultadiagareaconhecimentoDownloadRepository extends JpaRepository<ViewconsultadiagareaconhecimentoDownload, String> {
    List<ViewconsultadiagareaconhecimentoDownload> findByLogindownload(String logindownload);
}