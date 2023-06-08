package info.agrifam.apidiag.diagnosticos;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/caracterizacao")
public class CaracterizacaoController {
    private final CaracterizacaoRepository caracterizacaoRepository;
    private final CaracterizacaoMapper caracterizacaoMapper;

    public CaracterizacaoController(CaracterizacaoRepository caracterizacaoRepository,
                                    CaracterizacaoMapper caracterizacaoMapper) {
        this.caracterizacaoRepository = caracterizacaoRepository;
        this.caracterizacaoMapper = caracterizacaoMapper;
    }

    @GetMapping("/{id}")
    public CaracterizacaoDto getCaracterizacao(@PathVariable Integer id){
      return caracterizacaoMapper.toDto(caracterizacaoRepository.findById(id).orElseThrow());
    }
    @GetMapping()
    public List<CaracterizacaoDto> getCaracterizacoes(){
        return caracterizacaoRepository.findAll().stream().map(caracterizacaoMapper::toDto).collect(Collectors.toList());
    }
    @PostMapping()
    public CaracterizacaoDto save(@RequestBody CaracterizacaoDto caracterizacaoDto) {

        Caracterizacao caracterizacao =  caracterizacaoMapper.toEntity(caracterizacaoDto);
        return caracterizacaoMapper.toDto(caracterizacaoRepository.save(caracterizacao));
    }
    @PostMapping("/alterar")
    public CaracterizacaoDto update(@RequestBody  CaracterizacaoDto caracterizacaoDto) {
        if (caracterizacaoDto.getId() == null) {
            throw new IllegalArgumentException("Uso Água ID não nula, faça um novo lançamento");

        }
        Caracterizacao caracterizacao = caracterizacaoRepository.findById(caracterizacaoDto.getId()).orElseThrow();
        Caracterizacao caracterizacao1 = caracterizacaoMapper.partialUpdate(caracterizacaoDto, caracterizacao);
        return caracterizacaoMapper.toDto(caracterizacaoRepository.save(caracterizacao1));

    }
}
