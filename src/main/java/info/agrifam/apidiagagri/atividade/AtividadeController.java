package info.agrifam.apidiagagri.atividade;

import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/atividade")
public class AtividadeController {
    private final AtividadeRepository atividadeRepository;
    private final AtividadeMapper atividadeMapper;

    public AtividadeController(AtividadeRepository atividadeRepository, AtividadeMapper atividadeMapper) {
        this.atividadeRepository = atividadeRepository;
        this.atividadeMapper = atividadeMapper;
    }

    @GetMapping()
    public List<Atividade> Get(){

        List<Atividade> all = atividadeRepository.findAll( Sort.by("id") );
        return all;

    }
    @GetMapping("/{id}")
    public ResponseEntity<Atividade> GetById(@PathVariable(value = "id") Integer id){
        Optional<Atividade> atividade = atividadeRepository.findById(id);
        if(atividade.isPresent())
            return  new ResponseEntity<Atividade>(atividade.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    @PostMapping()
    public AtividadeDto saveAtividade(@RequestBody  AtividadeDto atividadeDto) {

        Atividade atividade =  atividadeMapper.toEntity(atividadeDto);
        return atividadeMapper.toDto(atividadeRepository.save(atividade));
    }
    @PostMapping("/alterar")
    public AtividadeDto updateAtividade(@RequestBody  AtividadeDto atividadeDto) {
        if (atividadeDto.getId() == null) {
            throw new IllegalArgumentException("Atividade ID não nula, faça um novo lançamento");

        }
        Atividade atividade = atividadeRepository.findById(atividadeDto.getId()).orElseThrow();
        Atividade updateatividade1 = atividadeMapper.partialUpdate(atividadeDto, atividade);
        return atividadeMapper.toDto(atividadeRepository.save(updateatividade1));

    }

}
