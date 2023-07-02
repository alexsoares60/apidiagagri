package info.agrifam.apidiagagri.sanitarismo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbatersanitarismo")
public class Sanitarismo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsanitarismo", nullable = false)
    private Integer id;

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

    @Size(max = 255)
    @Column(name = "logincreate")
    private String logincreate;

    @Column(name = "idcaracterizacao")
    private Integer idcaracterizacao;

}