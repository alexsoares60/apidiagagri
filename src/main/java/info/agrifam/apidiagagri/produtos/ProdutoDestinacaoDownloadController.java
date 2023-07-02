package info.agrifam.apidiagagri.produtos;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produtodestinacaodownload")
public class ProdutoDestinacaoDownloadController {

    private final ViewconsultaprodutosdestinacaoDownloadRepository produtodestinacaodownloadRepository;



    public ProdutoDestinacaoDownloadController(ViewconsultaprodutosdestinacaoDownloadRepository produtodestinacaodownloadRepository) {
        this.produtodestinacaodownloadRepository = produtodestinacaodownloadRepository;
    }

    @GetMapping("/logindownload/{logindownload}")
    public List<ViewconsultaprodutosdestinacaoDownload> GetProdutoDestinacaoDownload(@PathVariable(value = "logindownload") String arglogindownload){
        return produtodestinacaodownloadRepository.findByLogindownload(arglogindownload);}
}

