package info.agrifam.apidiagagri.sanitarismo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Sanitarismo} entity
 */
@Data
public class SanitarismoDto implements Serializable {
    private final Integer id;
    @NotNull
    private final Integer idupf;
    @NotNull
    private final Character stligacaodomiciliar;
    @NotNull
    private final Character stpocoraso;
    @NotNull
    private final Character stcisterna;
    @NotNull
    private final Character streservatorioelevado;
    @NotNull
    private final Character streservatoriosemielevado;
    @NotNull
    private final Character stconjuntosanitario;
    @NotNull
    private final Character stpiadecozinha;
    @NotNull
    private final Character sttanquedelavarroupa;
    @NotNull
    private final Character stfiltrodomestico;
    @NotNull
    private final Character sttanquesepticofiltrobio;
    @NotNull
    private final Character stsumidouro;
    @NotNull
    private final Character stvalainfiltracao;
    @NotNull
    private final Character stsistemareuso;
    @NotNull
    private final Character stligacaoesgoto;
    @NotNull
    private final Character starmazenamentoresiduossolidos;
    @NotNull
    private final Integer munid;
    @NotNull
    private final Character stcancelado;
    @Size(max = 255)
    private final String logincreate;
    private final Integer idcaracterizacao;
}