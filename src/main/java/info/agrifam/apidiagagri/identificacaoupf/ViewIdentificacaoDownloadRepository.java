package info.agrifam.apidiagagri.identificacaoupf;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewIdentificacaoDownloadRepository extends JpaRepository<ViewIdentificacaoDownload, Integer> {
//    List<ViewIdentificacaoDownload> findByLoginDownloadLike(String loginDownload);


    List<ViewIdentificacaoDownload> findAllByLoginDownload(String arglogindownload);
}