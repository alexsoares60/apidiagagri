package info.agrifam.apidiag.userprojetos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link ProjetosUsuario} entity
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjetosUsuarioDto implements Serializable {
    private  Integer id;
    @NotNull
    private  String login;
    @NotNull
    private  Integer idprojeto;
    @NotNull
    private  Character stcancelado;
}