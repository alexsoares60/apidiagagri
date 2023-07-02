package info.agrifam.apidiagagri.membrosfamilia;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Membrosfamilia} entity
 */
@Data
public class MembrosfamiliaDto implements Serializable {
    private final Long id;
    @NotNull
    private final Integer idcaracterizacaoupf;
    @NotNull
    private final Long idpessoa;
    @NotNull
    private final Character stparentesco;
    @NotNull
    private final Short idetinia;
    @NotNull
    private final Character stestuda;
    @NotNull
    private final Character idgrauescolaridade;
    @NotNull
    private final Integer idmobile;
    @NotNull
    private final Integer stenviado;
    @NotNull
    private final Character stcancelado;
    @Size(max = 50)
    @NotNull
    private final String logincreate;
}