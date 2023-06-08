package info.agrifam.apidiag.municipios;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Entity(name = "tbmunicipioscomunidades")
@Data
public class MunicipioComunidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcomunidade;
    private Long munid;
    private String sguf;
    private String dscomunidade;
    private String localizacao;
    private Long idmobile;
    private Long distanciamunicipio;

    public MunicipioComunidades(Long idcomunidade, Long munid, String sguf, String dscomunidade, String localizacao, Long idmobile, Long distanciamunicipio) {
        this.idcomunidade = idcomunidade;
        this.munid = munid;
        this.sguf = sguf;
        this.dscomunidade = dscomunidade;
        this.localizacao = localizacao;
        this.idmobile = idmobile;
        this.distanciamunicipio = distanciamunicipio;
    }

    public MunicipioComunidades() {
    }
}
