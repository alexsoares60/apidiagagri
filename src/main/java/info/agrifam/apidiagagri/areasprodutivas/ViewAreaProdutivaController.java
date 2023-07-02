package info.agrifam.apidiagagri.areasprodutivas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/areasprodutivasdownload")
public class ViewAreaProdutivaController {

    private final ViewareasprodutivaRepository areaprodutivadownloadRepository;



    public ViewAreaProdutivaController(ViewareasprodutivaRepository areaprodutivadownloadRepository) {
        this.areaprodutivadownloadRepository = areaprodutivadownloadRepository;
    }

    @GetMapping("/logindownload/{logindownload}")
    public List<Viewareasprodutiva> GetAreaProdutivaDownload(@PathVariable(value = "logindownload") String arglogindownload){
        return areaprodutivadownloadRepository.findByLogindownload(arglogindownload);}
}
