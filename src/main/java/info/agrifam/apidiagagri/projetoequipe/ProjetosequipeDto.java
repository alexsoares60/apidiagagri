package info.agrifam.apidiagagri.projetoequipe;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Projetosequipe} entity
 */
@Data
public class ProjetosequipeDto implements Serializable {
    private final Integer id;
    @NotNull
    private final Integer idprojeto;
    @NotNull
    private final Long idpessoa;
    @NotNull
    private final Integer tpfuncao;
}