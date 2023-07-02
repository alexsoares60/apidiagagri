package info.agrifam.apidiagagri.noticia;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link Noticia} entity
 */
@Data
public class NoticiaDto implements Serializable {
    @NotNull
    private final Long idnoticias;
    @Size(max = 500)
    @NotNull
    private final String titulo;
    private final String subtitulo;
    @Size(max = 2083)
    private final String urlimg;
    @Size(max = 100)
    private final String empresa;
    @NotNull
    private final Instant dtnoticia;
    @Size(max = 2083)
    @NotNull
    private final String urlnoticia;
}