package info.agrifam.apidiagagri.sanitarismo;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sanitarismo")
public class SanitarismoController {
    private final SanitarismoRepository sanitarismoRepository;
    private final SanitarismoMapper sanitarismoMapper;

    public SanitarismoController(SanitarismoRepository sanitarismoRepository, SanitarismoMapper sanitarismoMapper) {
        this.sanitarismoRepository = sanitarismoRepository;
        this.sanitarismoMapper = sanitarismoMapper;
    }

    @GetMapping()
    public List<Sanitarismo> Get(){
        return sanitarismoRepository.findAll();
    }

    @GetMapping("/upf/{idupf}")
    public List<Sanitarismo> GetCaracterizacao(@PathVariable(value = "idupf") Integer idupf){
        return sanitarismoRepository.findAllByIdupf(idupf);
    }
    @PostMapping()
    public SanitarismoDto save(@RequestBody SanitarismoDto sanitarismoDto) {

        Sanitarismo sanitarismo =  sanitarismoMapper.toEntity(sanitarismoDto);
        return sanitarismoMapper.toDto(sanitarismoRepository.save(sanitarismo));
    }
    @PostMapping("/alterar")
    public SanitarismoDto update(@RequestBody  SanitarismoDto sanitarismoDto) {
        if (sanitarismoDto.getId() == null) {
            throw new IllegalArgumentException("Uso Sanitarismo ID não nula, faça um novo lançamento");

        }
        Sanitarismo sanitarismo = sanitarismoRepository.findById(sanitarismoDto.getId()).orElseThrow();
        Sanitarismo sanitarismo1 = sanitarismoMapper.partialUpdate(sanitarismoDto, sanitarismo);
        return sanitarismoMapper.toDto(sanitarismoRepository.save(sanitarismo1));

    }
}
