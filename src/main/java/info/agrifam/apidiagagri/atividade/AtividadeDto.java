package info.agrifam.apidiag.atividade;

import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Atividade} entity
 */
@Data
public class AtividadeDto implements Serializable {
    private final Integer id;
    @Size(max = 100)
    private final String atvdescricao;
    private final Character stcancelado;
}