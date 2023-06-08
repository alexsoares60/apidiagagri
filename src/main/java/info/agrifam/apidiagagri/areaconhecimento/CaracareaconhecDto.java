package info.agrifam.apidiag.areaconhecimento;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Caracareaconhec} entity
 */
@Data
public class CaracareaconhecDto implements Serializable {
    private final Integer id;
    @NotNull
    private final Integer idcaracterizacao;
    private final Integer idareadeconhecimento;
    @Size(max = 200)
    private final String descmotivo;
    private final Integer idmobile;
    private final Character stcancelado;
    @Size(max = 255)
    private final String logincreate;
    @Size(max = 255)
    private final String descMotivo;
    private final Long idMobile;
}