package info.agrifam.apidiagagri.userprojetos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link ConsultaProjetosUsuariosProjeto} entity
 */
@Data
public class ConsultaProjetosUsuariosProjetoDto implements Serializable {
    @NotNull
    private final Integer id;
    @Size(max = 80)
    @NotNull
    private final String titulo;
    @Size(max = 32)
    @NotNull
    private final String login;
    @NotNull
    private final Integer idprojeto;
    @NotNull
    private final Character stcancelado;
}