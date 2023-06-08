package info.agrifam.apidiag.consultas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/membrosfamilia")
public class ConsultaMembrosFamiliaController {

    private final ConsultamembrosfamiliaRepository consultamembrosfamiliaRepository;

    public ConsultaMembrosFamiliaController(ConsultamembrosfamiliaRepository consultamembrosfamiliaRepository) {
        this.consultamembrosfamiliaRepository = consultamembrosfamiliaRepository;
    }
    @GetMapping()
    public List<Consultamembrosfamilia> Get(){

        List<Consultamembrosfamilia> all = consultamembrosfamiliaRepository.findAll( );
        return all;

    }
    @GetMapping("/{id}")
    public Optional<List<Consultamembrosfamilia>> GetById(@PathVariable(value = "id") Integer id) {
        Optional<List<Consultamembrosfamilia>> consultamembrosfamilias = consultamembrosfamiliaRepository.findByIdpessoa(id);
        if (consultamembrosfamilias.isPresent()) {
            Optional<List<Consultamembrosfamilia>> all = consultamembrosfamiliaRepository.findByIdpessoa(id);
            return all;
        }


        return consultamembrosfamilias;
    }
}
