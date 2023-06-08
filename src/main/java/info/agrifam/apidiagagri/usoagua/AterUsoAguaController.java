package info.agrifam.apidiag.usoagua;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usoagua")
public class AterUsoAguaController {
    private final AterpecusudaaguaRepository aterpecusudaaguaRepository;
    private final AterpecusudaaguaMapper aterpecusudaaguaMapper;

    public AterUsoAguaController(AterpecusudaaguaRepository aterpecusudaaguaRepository, AterpecusudaaguaMapper aterpecusudaaguaMapper) {
        this.aterpecusudaaguaRepository = aterpecusudaaguaRepository;
        this.aterpecusudaaguaMapper = aterpecusudaaguaMapper;
    }

    @GetMapping()
    public List<Aterpecusudaagua> Get(){
        return aterpecusudaaguaRepository.findAll();
    }

    @GetMapping("/caracterizacao/{idcaracterizacaoupf}")
    public List<Aterpecusudaagua> GetCaracterizacao(@PathVariable(value = "idcaracterizacaoupf") Integer idcaracterizacaoupf){
        return aterpecusudaaguaRepository.findAllByIdcaracterizacaoupf(idcaracterizacaoupf);
    }
    @PostMapping()
    public AterpecusudaaguaDto save(@RequestBody AterpecusudaaguaDto aterpecusudaaguaDto) {

        Aterpecusudaagua aterpecusudaagua =  aterpecusudaaguaMapper.toEntity(aterpecusudaaguaDto);
        return aterpecusudaaguaMapper.toDto(aterpecusudaaguaRepository.save(aterpecusudaagua));
    }
    @PostMapping("/alterar")
    public AterpecusudaaguaDto update(@RequestBody  AterpecusudaaguaDto aterpecusudaaguaDto) {
        if (aterpecusudaaguaDto.getId() == null) {
            throw new IllegalArgumentException("Uso Água ID não nula, faça um novo lançamento");

        }
        Aterpecusudaagua aterpecusudaagua = aterpecusudaaguaRepository.findById(aterpecusudaaguaDto.getId()).orElseThrow();
        Aterpecusudaagua aterpecusudaagua1 = aterpecusudaaguaMapper.partialUpdate(aterpecusudaaguaDto, aterpecusudaagua);
        return aterpecusudaaguaMapper.toDto(aterpecusudaaguaRepository.save(aterpecusudaagua1));

    }
}
