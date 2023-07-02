package info.agrifam.apidiagagri.sanitarismo;

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
@Table(name = "view_consulta_sanitarismo_download")
public class ViewConsultaSanitarismoDownload {
    @Id
    @NotNull
    @Column(name = "idsanitarismo", nullable = false)
    private Integer idsanitarismo;

    @NotNull
    @Column(name = "idupf", nullable = false)
    private Integer idupf;

    @NotNull
    @Column(name = "stligacaodomiciliar", nullable = false)
    private Character stligacaodomiciliar;

    @NotNull
    @Column(name = "stpocoraso", nullable = false)
    private Character stpocoraso;

    @NotNull
    @Column(name = "stcisterna", nullable = false)
    private Character stcisterna;

    @NotNull
    @Column(name = "streservatorioelevado", nullable = false)
    private Character streservatorioelevado;

    @NotNull
    @Column(name = "streservatoriosemielevado", nullable = false)
    private Character streservatoriosemielevado;

    @NotNull
    @Column(name = "stconjuntosanitario", nullable = false)
    private Character stconjuntosanitario;

    @NotNull
    @Column(name = "stpiadecozinha", nullable = false)
    private Character stpiadecozinha;

    @NotNull
    @Column(name = "sttanquedelavarroupa", nullable = false)
    private Character sttanquedelavarroupa;

    @NotNull
    @Column(name = "stfiltrodomestico", nullable = false)
    private Character stfiltrodomestico;

    @NotNull
    @Column(name = "sttanquesepticofiltrobio", nullable = false)
    private Character sttanquesepticofiltrobio;

    @NotNull
    @Column(name = "stsumidouro", nullable = false)
    private Character stsumidouro;

    @NotNull
    @Column(name = "stvalainfiltracao", nullable = false)
    private Character stvalainfiltracao;

    @NotNull
    @Column(name = "stsistemareuso", nullable = false)
    private Character stsistemareuso;

    @NotNull
    @Column(name = "stligacaoesgoto", nullable = false)
    private Character stligacaoesgoto;

    @NotNull
    @Column(name = "starmazenamentoresiduossolidos", nullable = false)
    private Character starmazenamentoresiduossolidos;

    @NotNull
    @Column(name = "munid", nullable = false)
    private Integer munid;

    @NotNull
    @Column(name = "stcancelado", nullable = false)
    private Character stcancelado;

    @NotNull
    @Column(name = "idcaracterizacaoupf", nullable = false)
    private Integer idcaracterizacaoupf;

    @Column(name = "fazdownload")
    private Character fazdownload;

    @Size(max = 32)
    @Column(name = "login_download", length = 32)
    private String loginDownload;

    @Size(max = 200)
    @NotNull
    @Column(name = "pesnm", nullable = false, length = 200)
    private String pesnm;

    @Size(max = 14)
    @NotNull
    @Column(name = "pesnrcpfcnpj", nullable = false, length = 14)
    private String pesnrcpfcnpj;

    @Size(max = 50)
    @Column(name = "apelido", length = 50)
    private String apelido;

    @Size(max = 16)
    @Column(name = "pescelular", length = 16)
    private String pescelular;

    @Size(max = 256)
    @NotNull
    @Column(name = "pesemail", nullable = false, length = 256)
    private String pesemail;

    @Size(max = 80)
    @Column(name = "upfnomepropriedade", length = 80)
    private String upfnomepropriedade;

    @Size(max = 20)
    @Column(name = "upfcoordenadaslatitude", length = 20)
    private String upfcoordenadaslatitude;

    @Size(max = 20)
    @Column(name = "upfcoordenadaslongitude", length = 20)
    private String upfcoordenadaslongitude;

    @Size(max = 80)
    @NotNull
    @Column(name = "munnm", nullable = false, length = 80)
    private String munnm;

    @Size(max = 100)
    @NotNull
    @Column(name = "dscomunidade", nullable = false, length = 100)
    private String dscomunidade;

}