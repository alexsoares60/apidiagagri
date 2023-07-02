package info.agrifam.apidiagagri.areasprodutivas;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/areasprodutivas")
public class CaracterizacaoAreasProdutivasController {

    private final CaracterizacaoAreasProdutivasRepository caracareaprodutivaRepository;
    private final CaracterizacaoAreasProdutivasMapper caracareaprodutivaMapper;

//    public CaracareaconhecController(CaracterizacaoAreasProdutivasRepository caracareaprodutivaRepository, CaracterizacaoAreasProdutivasMapper caracareaprodutivaMapper) {
//        this.caracareaprodutivaRepository = caracareaprodutivaRepository;
//        this.caracareaprodutivaMapper = caracareaprodutivaMapper;
//    }

    public CaracterizacaoAreasProdutivasController(CaracterizacaoAreasProdutivasRepository caracareaprodutivaRepository, CaracterizacaoAreasProdutivasMapper caracareaprodutivaMapper) {
        this.caracareaprodutivaRepository = caracareaprodutivaRepository;
        this.caracareaprodutivaMapper = caracareaprodutivaMapper;
    }

    @GetMapping()
    public List<CaracterizacaoAreasProdutivasDto> Get(){
        return caracareaprodutivaRepository.findAll().stream().map(caracareaprodutivaMapper::toDto).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public CaracterizacaoAreasProdutivasDto GetCaracAreaProdutiva(@PathVariable Integer id){
        return caracareaprodutivaMapper.toDto(caracareaprodutivaRepository.findById(id).orElseThrow());
    }
    @PostMapping()
    public CaracterizacaoAreasProdutivasDto save(@RequestBody CaracterizacaoAreasProdutivasDto caracareaprodutivaDto) {

        CaracterizacaoAreasProdutivas caracareaprodutiva =  caracareaprodutivaMapper.toEntity(caracareaprodutivaDto);
        return caracareaprodutivaMapper.toDto(caracareaprodutivaRepository.save(caracareaprodutiva));
    }
    @PostMapping("/alterar")
    public CaracterizacaoAreasProdutivasDto update(@RequestBody  CaracterizacaoAreasProdutivasDto caracareaprodutivaDto) {
        if (caracareaprodutivaDto.getId() == null) {
            throw new IllegalArgumentException("CaracareaProdutiva ID não nula, faça um novo lançamento");

        }
        CaracterizacaoAreasProdutivas caracareaprodutiva = caracareaprodutivaRepository.findById(caracareaprodutivaDto.getId()).orElseThrow();
        CaracterizacaoAreasProdutivas caracareaprodutiva1 = caracareaprodutivaMapper.partialUpdate(caracareaprodutivaDto, caracareaprodutiva);
        return caracareaprodutivaMapper.toDto(caracareaprodutivaRepository.save(caracareaprodutiva1));

    }
}
