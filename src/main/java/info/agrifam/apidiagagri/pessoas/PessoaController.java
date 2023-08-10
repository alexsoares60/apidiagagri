package info.agrifam.apidiagagri.pessoas;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
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
    @GetMapping("/login/{loginDownload}")
    public Optional<List<Pessoa>> getPessoaDownload(@PathVariable String loginDownload){
        return Optional.of(pessoaRepository.findByLoginDownloadAndFazdownloadOrderByMunidAsc(loginDownload,'S').orElseThrow());
    }
    @GetMapping()
    public List<PessoaDto> getPessoas(){
        return pessoaRepository.findAll().stream().map(pessoaMapper::toDto).collect(Collectors.toList());
    }
    @PostMapping()
    public PessoaDto save(@RequestBody PessoaDto pessoaDto) {

        Pessoa pessoa =  pessoaMapper.toEntity(pessoaDto);
        Optional<Pessoa>   assessors1opt = pessoaRepository.findByPesnrcpfcnpj(pessoaDto.getPesnrcpfcnpj());

        if (assessors1opt.isPresent()) {
            System.out.println("teste");
            System.out.println(assessors1opt.toString());
            System.out.println(pessoaDto.toString());
            Pessoa pessoa2 = pessoaRepository.findByPesnrcpfcnpj(pessoaDto.getPesnrcpfcnpj()).orElseThrow();
            Pessoa pessoa1 = pessoaMapper.partialUpdate(pessoaDto, pessoa2);
            return pessoaMapper.toDto(pessoaRepository.save(pessoa1));

        } else {
            return pessoaMapper.toDto(pessoaRepository.save(pessoa));

        }
//        return pessoaMapper.toDto(pessoaRepository.save(pessoa));


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
