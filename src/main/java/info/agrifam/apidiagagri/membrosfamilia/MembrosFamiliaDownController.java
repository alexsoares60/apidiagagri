package info.agrifam.apidiagagri.membrosfamilia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1/membrosfamdownload")
public class MembrosFamiliaDownController {

    private final MembrosfamiliadownloadRepository membrosfamiliadownloadRepository;

    public MembrosFamiliaDownController(MembrosfamiliadownloadRepository membrosfamiliadownloadRepository) {
        this.membrosfamiliadownloadRepository = membrosfamiliadownloadRepository;
    }
    @GetMapping("/logindownload/{logindownload}")
    public List<Membrosfamiliadownload> GetMembrosFamDown(@PathVariable(value = "logindownload") String arglogindownload){
        return membrosfamiliadownloadRepository.findByLogindownload(Objects.requireNonNull(arglogindownload));}
}

