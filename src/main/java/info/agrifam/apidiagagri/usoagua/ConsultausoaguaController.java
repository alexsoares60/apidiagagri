package info.agrifam.apidiagagri.usoagua;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/consultausoaguadownload")
public class ConsultausoaguaController {

    private final ViewconsultausoaguaRepository consultausoaguadownloadRepository;



    public ConsultausoaguaController(ViewconsultausoaguaRepository consultausoaguadownloadRepository) {
        this.consultausoaguadownloadRepository = consultausoaguadownloadRepository;
    }

    @GetMapping("/logindownload/{logindownload}")
    public List<Viewconsultausoagua> GetConsultausoaguaDownload(@PathVariable(value = "logindownload") String arglogindownload){
        return consultausoaguadownloadRepository.findByLogindownload(arglogindownload);}
}

