package info.agrifam.apidiagagri.areaconhecimento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/diagareaconhecimentodownload")
public class DiagareaConhecimentoDownloadController {

    private final ViewconsultadiagareaconhecimentoDownloadRepository diagareaconhecimentodownloadRepository;



    public DiagareaConhecimentoDownloadController(ViewconsultadiagareaconhecimentoDownloadRepository diagareaconhecimentodownloadRepository) {
        this.diagareaconhecimentodownloadRepository = diagareaconhecimentodownloadRepository;
    }

    @GetMapping("/logindownload/{logindownload}")
    public List<ViewconsultadiagareaconhecimentoDownload> GetDiagConsultaareaconhecimentoDownload(@PathVariable(value = "logindownload") String arglogindownload){
        return diagareaconhecimentodownloadRepository.findByLogindownload(arglogindownload);}
}

