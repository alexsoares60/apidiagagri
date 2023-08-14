package info.agrifam.apidiagagri.projetoequipe;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Projetosequipepessoa} entity
 */
@Data
public class ProjetosequipepessoaDto implements Serializable {
    @NotNull
    private final Integer id;
    @NotNull
    private final Long idpessoa;
    @NotNull
    private final Integer idprojeto;
    @NotNull
    private final Integer tpfuncao;
    @Size(max = 200)
    @NotNull
    private final String nome;
}