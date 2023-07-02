package info.agrifam.apidiagagri.identificacaoupf;



import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/identificacaoupf")
public class IdentificacaoupfController {
    private final IdentificacaoupfRepository identificacaoupfRepository;
    private final IdentificacaoupfMapper identificacaoupfMapper;

    public IdentificacaoupfController(IdentificacaoupfRepository identificacaoupfRepository, IdentificacaoupfMapper identificacaoupfMapper) {
        this.identificacaoupfRepository = identificacaoupfRepository;
        this.identificacaoupfMapper = identificacaoupfMapper;
    }

    @GetMapping()
    public List<Identificacaoupf> Get(){
        return identificacaoupfRepository.findAll();
    }

    @GetMapping("/upf/{idupf}")
    public Optional<Identificacaoupf> GetCaracterizacao(@PathVariable(value = "idupf") Integer idupf){
        if (idupf == null) {
            throw new IllegalArgumentException("Identificacao ID  nula, ");

        }
        return identificacaoupfRepository.findById(idupf);
    }
    @PostMapping()
    public IdentificacaoupfDto save(@RequestBody IdentificacaoupfDto identificacaoupfDto) {

        Identificacaoupf identificacaoupf =  identificacaoupfMapper.toEntity(identificacaoupfDto);
        return identificacaoupfMapper.toDto(identificacaoupfRepository.save(identificacaoupf));
    }
    @PostMapping("/alterar")
    public IdentificacaoupfDto update(@RequestBody  IdentificacaoupfDto identificacaoupfDto) {
        if (identificacaoupfDto.getId() == null) {
            throw new IllegalArgumentException("Identificacao ID não nula, faça um novo lançamento");

        }
        Identificacaoupf identificacaoupf = identificacaoupfRepository.findById(identificacaoupfDto.getId()).orElseThrow();
        Identificacaoupf identificacaoupf1 = identificacaoupfMapper.partialUpdate(identificacaoupfDto, identificacaoupf);
        return identificacaoupfMapper.toDto(identificacaoupfRepository.save(identificacaoupf1));

    }
}
