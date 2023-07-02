package info.agrifam.apidiagagri.noticia;

import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/noticias")
public class NoticiaController {
    private final NoticiaRepository noticiaRepository;
    private final NoticiaMapper noticiaMapper;

    public NoticiaController(NoticiaRepository noticiaRepository, NoticiaMapper noticiaMapper) {
        this.noticiaRepository = noticiaRepository;
        this.noticiaMapper = noticiaMapper;
    }

    @GetMapping()
    public List<Noticia> Get(){

        List<Noticia> all = noticiaRepository.findAll( Sort.by("idnoticias") );
        return all;

    }
}