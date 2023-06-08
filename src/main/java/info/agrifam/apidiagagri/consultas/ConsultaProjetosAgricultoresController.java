package info.agrifam.apidiag.consultas;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/projetosagricultores")
public class ConsultaProjetosAgricultoresController {
    private final ConsultaAgricultoresporprojetoRepository consultaAgricultoresporprojetoRepository;

    public ConsultaProjetosAgricultoresController(ConsultaAgricultoresporprojetoRepository consultaAgricultoresporprojetoRepository) {
        this.consultaAgricultoresporprojetoRepository = consultaAgricultoresporprojetoRepository;
    }
    @GetMapping()
    public List<ConsultaAgricultoresporprojeto> Get(){

        List<ConsultaAgricultoresporprojeto> all = consultaAgricultoresporprojetoRepository.findAll( );
        return all;

    }
    @GetMapping("/{id}")
    public Optional<List<ConsultaAgricultoresporprojeto>> GetById(@PathVariable(value = "id") Integer id) {
        Optional<List<ConsultaAgricultoresporprojeto>> consultaAgricultoresporprojeto = consultaAgricultoresporprojetoRepository.findByIdprojeto(id);
        if (consultaAgricultoresporprojeto.isPresent()) {
            return consultaAgricultoresporprojetoRepository.findByIdprojeto(id);
        }


        return consultaAgricultoresporprojeto;
    }}
