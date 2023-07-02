package info.agrifam.apidiagagri.areaconhecimento;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/caracareaconhecimento")
public class CaracareaconhecController {

    private final CaracareaconhecRepository caracareaconhecRepository;
    private final CaracareaconhecMapper caracareaconhecMapper;

    public CaracareaconhecController(CaracareaconhecRepository caracareaconhecRepository, CaracareaconhecMapper caracareaconhecMapper) {
        this.caracareaconhecRepository = caracareaconhecRepository;
        this.caracareaconhecMapper = caracareaconhecMapper;
    }

    @GetMapping()
    public List<CaracareaconhecDto> Get(){
        return caracareaconhecRepository.findAll().stream().map(caracareaconhecMapper::toDto).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public CaracareaconhecDto GetCaracareaconhecimento(@PathVariable Integer id){
        return caracareaconhecMapper.toDto(caracareaconhecRepository.findById(id).orElseThrow());
    }
    @PostMapping()
    public CaracareaconhecDto save(@RequestBody CaracareaconhecDto caracareaconhecDto) {

        Caracareaconhec caracareaconhec =  caracareaconhecMapper.toEntity(caracareaconhecDto);
        return caracareaconhecMapper.toDto(caracareaconhecRepository.save(caracareaconhec));
    }
    @PostMapping("/alterar")
    public CaracareaconhecDto update(@RequestBody  CaracareaconhecDto caracareaconhecDto) {
        if (caracareaconhecDto.getId() == null) {
            throw new IllegalArgumentException("Caracareaconhec ID não nula, faça um novo lançamento");

        }
        Caracareaconhec caracareaconhec = caracareaconhecRepository.findById(caracareaconhecDto.getId()).orElseThrow();
        Caracareaconhec caracareaconhec1 = caracareaconhecMapper.partialUpdate(caracareaconhecDto, caracareaconhec);
        return caracareaconhecMapper.toDto(caracareaconhecRepository.save(caracareaconhec1));

    }
}
