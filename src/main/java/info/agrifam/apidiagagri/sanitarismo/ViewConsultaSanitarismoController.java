package info.agrifam.apidiagagri.sanitarismo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/consultasanitarismodownload")
public class ViewConsultaSanitarismoController {

    private final ViewConsultaSanitarismoDownloadRepository sanitarismodownloadRepository;



    public ViewConsultaSanitarismoController(ViewConsultaSanitarismoDownloadRepository sanitarismodownloadRepository) {
        this.sanitarismodownloadRepository = sanitarismodownloadRepository;
    }

    @GetMapping("/logindownload/{logindownload}")
    public List<ViewConsultaSanitarismoDownload> GetAreaProdutivaDownload(@PathVariable(value = "logindownload") String arglogindownload){
        return sanitarismodownloadRepository.findByLoginDownload(arglogindownload);}
}

