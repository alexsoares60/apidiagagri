package info.agrifam.apidiagagri.projetoequipe;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Projetosequipetipofuncao} entity
 */
@Data
public class ProjetosequipetipofuncaoDto implements Serializable {
    private final Integer id;
    @Size(max = 45)
    @NotNull
    private final String descricaoTipoFuncao;
}