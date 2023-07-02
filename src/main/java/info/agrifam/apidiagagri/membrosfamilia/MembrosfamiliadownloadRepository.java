package info.agrifam.apidiagagri.membrosfamilia;

import info.agrifam.apidiagagri.membrosfamilia.Membrosfamiliadownload;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MembrosfamiliadownloadRepository extends JpaRepository<Membrosfamiliadownload, String> {
    List<Membrosfamiliadownload> findByLogindownload(String arglogindownload);
}