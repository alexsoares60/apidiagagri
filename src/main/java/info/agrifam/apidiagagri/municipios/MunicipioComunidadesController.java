package info.agrifam.apidiag.municipios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/municipiocomunidades")

public class MunicipioComunidadesController {

    @Autowired
    private MunicipioComunidadesService municipioComunidadesService ;

    @GetMapping("/ids/{argids}")
    public ResponseEntity<List<MunicipioComunidadesDTO>> getMunicipioComunidades(@PathVariable("argids") String argids){

        return ResponseEntity.ok(municipioComunidadesService.getComunidades(argids));
    }
}
