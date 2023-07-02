package info.agrifam.apidiagagri.noticia;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tbnoticias")
public class Noticia {
    @Id
    @NotNull
    @Column(name = "idnoticias", nullable = false)
    private Long idnoticias;

    @Size(max = 500)
    @NotNull
    @Column(name = "titulo", nullable = false, length = 500)
    private String titulo;

    @Lob
    @Column(name = "subtitulo")
    private String subtitulo;

    @Size(max = 2083)
    @Column(name = "urlimg", length = 2083)
    private String urlimg;

    @Size(max = 100)
    @Column(name = "empresa", length = 100)
    private String empresa;

    @NotNull
    @Column(name = "dtnoticia", nullable = false)
    private Instant dtnoticia;

    @Size(max = 2083)
    @NotNull
    @Column(name = "urlnoticia", nullable = false, length = 2083)
    private String urlnoticia;

}