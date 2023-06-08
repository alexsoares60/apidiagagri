package info.agrifam.apidiag.municipios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class MunicipioComunidadesService {

    @Autowired
    private MunicipioComunidadesRepository municipioComunidadesRepository;

    public List<MunicipioComunidadesDTO> getComunidades(String Id) {

        List<Long> Ids = Stream.of(Id.split(","))
                .map(String::trim)
                .map(Long::parseLong)
                .collect(Collectors.toList());

        List<MunicipioComunidades> municipioComunidadesList = municipioComunidadesRepository.findAllBymunidIn(Ids, Sort.by("dscomunidade"));
        //   List<Municipios> municipiosList = municipiosRepository.findAllBySGUF("AC");
        List<MunicipioComunidadesDTO> municipioComunidadesDTOList = new ArrayList<>();

        for ( MunicipioComunidades munComunidades : municipioComunidadesList) {
            municipioComunidadesDTOList.add(MunicipioComunidadesDTO.create(munComunidades));
        }
        return municipioComunidadesDTOList;
    }

}
