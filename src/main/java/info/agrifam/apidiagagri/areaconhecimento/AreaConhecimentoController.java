package info.agrifam.apidiag.areaconhecimento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/areaconhecimento")
public class AreaConhecimentoController {

    private final AreaconhecimentoRepository areaConhecimentoRepository;
    private final AreaconhecimentoMapper areaConhecimentoMapper;

    public AreaConhecimentoController(AreaconhecimentoRepository areaConhecimentoRepository, AreaconhecimentoMapper areaConhecimentoMapper) {
        this.areaConhecimentoRepository = areaConhecimentoRepository;
        this.areaConhecimentoMapper = areaConhecimentoMapper;
    }

    @GetMapping()
    public List<Areaconhecimento> Get(){
        return areaConhecimentoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Areaconhecimento> GetCaracterizacao(@PathVariable(value = "id") Integer id){
        return areaConhecimentoRepository.findById(id);
    }
}
