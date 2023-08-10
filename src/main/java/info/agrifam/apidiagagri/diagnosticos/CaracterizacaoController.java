package info.agrifam.apidiagagri.diagnosticos;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
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
        Optional<Caracterizacao> optional1 = caracterizacaoRepository.findByDtcaracterizacaoupfAndIdpessoachefefamilia( caracterizacao.getDtcaracterizacaoupf(),caracterizacao.getIdpessoachefefamilia());
        System.out.println("Caracterização opcional "+optional1.toString());

        if(optional1.isPresent()){
            System.out.println("Caracterização já inserida "+optional1.toString());
            Caracterizacao db = optional1.get();
            Integer rtn = optional1.get().getId();
            System.out.println("Caracterização idcarac "+rtn.toString());
            caracterizacao.setId(rtn);
            Caracterizacao caracterizacao1 = caracterizacaoMapper.partialUpdate(caracterizacaoDto, caracterizacao);
            return caracterizacaoMapper.toDto(caracterizacaoRepository.save(caracterizacao1));
//            System.out.println(caracterizacaoUPFnova.toString());

        }
        caracterizacao.setFazdownload('N');
        return caracterizacaoMapper.toDto(caracterizacaoRepository.save(caracterizacao));
    }
    @PostMapping("/alterar")
    public CaracterizacaoDto update(@RequestBody  CaracterizacaoDto caracterizacaoDto) {
        if (caracterizacaoDto.getId() == null) {
            throw new IllegalArgumentException("Caracterização ID não nula, faça um novo lançamento");

        }
        Caracterizacao caracterizacao = caracterizacaoRepository.findById(caracterizacaoDto.getId()).orElseThrow();
        caracterizacao.setFazdownload('N');
        Caracterizacao caracterizacao1 = caracterizacaoMapper.partialUpdate(caracterizacaoDto, caracterizacao);
        caracterizacao1.setFazdownload('N');
        return caracterizacaoMapper.toDto(caracterizacaoRepository.save(caracterizacao1));

    }
}
