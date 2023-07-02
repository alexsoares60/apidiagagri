package info.agrifam.apidiagagri.membrosfamilia;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cadmembrosfamilia")
public class MembrosFamiliaController {
    private final MembrosfamiliaRepository membrosfamiliaRepository;
    private final MembrosfamiliaMapper membrosfamiliaMapper;

    public MembrosFamiliaController(MembrosfamiliaRepository membrosfamiliaRepository, MembrosfamiliaMapper membrosfamiliaMapper) {
        this.membrosfamiliaRepository = membrosfamiliaRepository;
        this.membrosfamiliaMapper = membrosfamiliaMapper;
    }
    @GetMapping()
    public List<Membrosfamilia> Get(){

        return membrosfamiliaRepository.findAll( );

    }
    @PostMapping()
    public MembrosfamiliaDto save(@RequestBody MembrosfamiliaDto membrosfamiliaDto) {

        Membrosfamilia membrosfamilia =  membrosfamiliaMapper.toEntity(membrosfamiliaDto);
        return membrosfamiliaMapper.toDto(membrosfamiliaRepository.save(membrosfamilia));
    }
    @PostMapping("/alterar")
    public MembrosfamiliaDto update(@RequestBody  MembrosfamiliaDto membrosfamiliaDto) {
        if (membrosfamiliaDto.getId() == null) {
            throw new IllegalArgumentException("Membros da familia ID não nula, faça um novo lançamento");

        }
        Membrosfamilia membrosfamilia =  membrosfamiliaRepository.findById(membrosfamiliaDto.getId()).orElseThrow();

        Membrosfamilia membrosfamilia1 = membrosfamiliaMapper.partialUpdate(membrosfamiliaDto, membrosfamilia);
        return membrosfamiliaMapper.toDto(membrosfamiliaRepository.save(membrosfamilia1));

//        Membrosfamilia membrosfamilia1 = membrosfamiliaMapper.partialUpdate(membrosfamiliaDto, membrosfamilia);


    }


}
