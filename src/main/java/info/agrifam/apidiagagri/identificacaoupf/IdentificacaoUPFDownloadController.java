package info.agrifam.apidiagagri.identificacaoupf;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/identificacaoupfdownload")
public class IdentificacaoUPFDownloadController {

    private final ViewIdentificacaoDownloadRepository identicacaoUPFdownloadRepository;



    public IdentificacaoUPFDownloadController(ViewIdentificacaoDownloadRepository identicacaoUPFdownloadRepository) {
        this.identicacaoUPFdownloadRepository = identicacaoUPFdownloadRepository;
    }

    @GetMapping("/logindownload/{logindownload}")
    public List<ViewIdentificacaoDownload> GetIdenticacaoUPFDownload(@PathVariable(value = "logindownload") String arglogindownload){
        return identicacaoUPFdownloadRepository.findAllByLoginDownload(arglogindownload);}
}

