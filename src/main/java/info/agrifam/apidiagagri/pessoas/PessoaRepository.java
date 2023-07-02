package info.agrifam.apidiagagri.pessoas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
//    @Query("select p from Pessoa p where p.loginDownload = :loginDownload and p.fazdownload = ?2")
//    Optional<List<Pessoa>> findByLoginDownloadAndFazdownload(@Param("loginDownload") String loginDownload,"S");

    Optional<List<Pessoa>> findByLoginDownloadAndFazdownloadOrderByMunidAsc(String loginDownload, Character fazdownload);

    Optional<Pessoa> findByPesnrcpfcnpj(String pesnrcpfcnpj);
//    Optional<Object> findByLoginDownload(String loginDownload);
}