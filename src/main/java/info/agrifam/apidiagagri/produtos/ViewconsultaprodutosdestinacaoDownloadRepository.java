package info.agrifam.apidiagagri.produtos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewconsultaprodutosdestinacaoDownloadRepository extends JpaRepository<ViewconsultaprodutosdestinacaoDownload, String> {
    List<ViewconsultaprodutosdestinacaoDownload> findByLogindownload(String logindownload);
}