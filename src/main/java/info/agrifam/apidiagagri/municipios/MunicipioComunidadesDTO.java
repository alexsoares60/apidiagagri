package info.agrifam.apidiagagri.municipios;

import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class MunicipioComunidadesDTO {

    private Long idcomunidade;
    private Long munid;
    private String sguf;
    private String dscomunidade;
    private String localizacao;
    private Long idmobile;
    private Long distanciamunicipio;

    public static MunicipioComunidadesDTO create(MunicipioComunidades m) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(m, MunicipioComunidadesDTO.class );
    }
}
