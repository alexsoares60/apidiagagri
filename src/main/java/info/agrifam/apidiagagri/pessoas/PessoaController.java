package info.agrifam.apidiag.pessoas;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/pessoa")
public class PessoaController {
    private final PessoaRepository pessoaRepository;
    private final PessoaMapper pessoaMapper;

    public PessoaController(PessoaRepository pessoaRepository,
                            PessoaMapper pessoaMapper) {
        this.pessoaRepository = pessoaRepository;
        this.pessoaMapper = pessoaMapper;
    }

    @GetMapping("/{id}")
    public PessoaDto getPessoa(@PathVariable Long id){
        return pessoaMapper.toDto(pessoaRepository.findById(id).orElseThrow());
    }
    @GetMapping()
    public List<PessoaDto> getPessoas(){
        return pessoaRepository.findAll().stream().map(pessoaMapper::toDto).collect(Collectors.toList());
    }
    @PostMapping()
    public PessoaDto save(@RequestBody PessoaDto pessoaDto) {

        Pessoa pessoa =  pessoaMapper.toEntity(pessoaDto);
        return pessoaMapper.toDto(pessoaRepository.save(pessoa));
    }
    @PostMapping("/alterar")
    public PessoaDto update(@RequestBody  PessoaDto pessoaDto) {
        if (pessoaDto.getId() == null) {
            throw new IllegalArgumentException("Pessoa ID não nula, faça um novo lançamento");

        }
        Pessoa pessoa = pessoaRepository.findById(pessoaDto.getId()).orElseThrow();
        Pessoa pessoa1 = pessoaMapper.partialUpdate(pessoaDto, pessoa);
        return pessoaMapper.toDto(pessoaRepository.save(pessoa1));

    }
}
