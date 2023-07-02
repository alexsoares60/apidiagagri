package info.agrifam.apidiagagri.municipios;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Municipio} entity
 */
@Data
public class MunicipioDto implements Serializable {
    private final Integer id;
    private final Integer terid;
    private final String sguf;
    @Size(max = 80)
    @NotNull
    private final String munnm;
}