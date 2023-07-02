package info.agrifam.apidiagagri.areaconhecimento;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Areaconhecimento} entity
 */
@Data
public class AreaconhecimentoDto implements Serializable {
    private final Integer idareadeconhecimento;
    @Size(max = 80)
    @NotNull
    private final String nmareadeconhecimento;
    @Size(max = 400)
    private final String descareadeconhecimento;
    @NotNull
    private final Character stcancelado;
}