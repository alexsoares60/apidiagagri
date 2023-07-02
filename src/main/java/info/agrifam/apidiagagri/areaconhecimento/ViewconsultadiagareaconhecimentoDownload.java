package info.agrifam.apidiagagri.areaconhecimento;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "viewconsultadiagareaconhecimento_download")
public class ViewconsultadiagareaconhecimentoDownload {
    @Id
    @Size(max = 36)
    @Column(name = "rownum", length = 36)
    private String rownum;

    @Column(name = "fazdownload")
    private Character fazdownload;

    @Size(max = 32)
    @Column(name = "logindownload", length = 32)
    private String logindownload;

    @NotNull
    @Column(name = "idcaracterizacaoupf", nullable = false)
    private Integer idcaracterizacaoupf;

    @NotNull
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 20)
    @Column(name = "latitude", length = 20)
    private String latitude;

    @Size(max = 20)
    @Column(name = "longitude", length = 20)
    private String longitude;

    @Size(max = 80)
    @Column(name = "nomepropriedade", length = 80)
    private String nomepropriedade;

    @Size(max = 200)
    @NotNull
    @Column(name = "agricultor", nullable = false, length = 200)
    private String agricultor;

    @Column(name = "genero")
    private Character genero;

    @Size(max = 256)
    @NotNull
    @Column(name = "email", nullable = false, length = 256)
    private String email;

    @Size(max = 16)
    @Column(name = "celular", length = 16)
    private String celular;

    @Size(max = 80)
    @NotNull
    @Column(name = "municipio", nullable = false, length = 80)
    private String municipio;

    @Column(name = "munid")
    private Integer munid;

    @Column(name = "idareadeconhecimento")
    private Integer idareadeconhecimento;

    @Size(max = 80)
    @NotNull
    @Column(name = "nmareadeconhecimento", nullable = false, length = 80)
    private String nmareadeconhecimento;

    @Column(name = "idmobile")
    private Integer idmobile;

    @Size(max = 200)
    @Column(name = "descmotivo", length = 200)
    private String descmotivo;

    @NotNull
    @Column(name = "cancelado", nullable = false)
    private Character cancelado;

    @Size(max = 60)
    @Column(name = "comunidade", length = 60)
    private String comunidade;

}