package info.agrifam.apidiagagri.diagnosticos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/v1/condiagnosticos")
public class ConsultaDiagnosticosController {

    private final ConsultadiagnosticoRepository consultadiagnosticoRepository;

    public ConsultaDiagnosticosController(ConsultadiagnosticoRepository consultadiagnosticoRepository) {
        this.consultadiagnosticoRepository = consultadiagnosticoRepository;
    }

    @GetMapping("/municipio/{argids}")
    public List<Consultadiagnostico> GetCaracterizacao(@PathVariable(value = "argids") String argids){
        if (argids == null) {
            throw new IllegalArgumentException("Lista de Municipios ID  nula, ");

        }
        List<Integer> Ids = Stream.of(argids.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return consultadiagnosticoRepository.findAllByMunidIn(Ids);
    }
    @GetMapping("/login/{arglogindownload}")
    public List<Consultadiagnostico> GetCaracterizacaoLogin(@PathVariable(value = "arglogindownload") String arglogindownload){
        if (arglogindownload == null) {
            throw new IllegalArgumentException("login ID  nula, ");

        }

        return consultadiagnosticoRepository.findAllByLogindownload(arglogindownload);
    }
}
