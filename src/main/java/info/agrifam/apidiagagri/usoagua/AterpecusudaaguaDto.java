package info.agrifam.apidiagagri.usoagua;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Aterpecusudaagua} entity
 */
@Data
public class AterpecusudaaguaDto implements Serializable {
    private final Integer id;
    @NotNull
    private final Integer idcaracterizacaoupf;
    @NotNull
    private final Integer upfcrctipofonteagua;
    @NotNull
    private final Character stdessendentacaoanimal;
    @NotNull
    private final Character stirrigacao;
    @NotNull
    private final Character stlimpezadeequipamentos;
    private final Integer idmobile;
    private final Character stcancelado;
}