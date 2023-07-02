package info.agrifam.apidiagagri.userprojetos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "view_projetos_usuarios_projetos")
public class ConsultaProjetosUsuariosProjeto {
    @Id
    @NotNull
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 80)
    @NotNull
    @Column(name = "titulo", nullable = false, length = 80)
    private String titulo;

    @Size(max = 32)
    @NotNull
    @Column(name = "login", nullable = false, length = 32)
    private String login;

    @NotNull
    @Column(name = "idprojeto", nullable = false)
    private Integer idprojeto;

    @NotNull
    @Column(name = "stcancelado", nullable = false)
    private Character stcancelado;

}