package info.agrifam.apidiag.municipios;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Usuariosmunicipio} entity
 */
@Data
public class UsuariosmunicipioDto implements Serializable {
    private final String id;
    private final String login;
    private final Integer munid;
    @Size(max = 80)
    @NotNull
    private final String munnm;
    @Size(max = 2)
    private final String sguf;
    private final Integer terid;
    @NotNull
    private final Character stcancelado;
}