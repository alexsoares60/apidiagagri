package info.agrifam.apidiag.municipios;

import jakarta.persistence.*;
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
@Table(name = "view_usuariosmunicipios")
public class Usuariosmunicipio {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @NotNull
    @Column(name = "munid", nullable = false)
    private Integer munid;

    @Size(max = 32)
    @NotNull
    @Column(name = "login", nullable = false, length = 32)
    private String login;

    @Size(max = 80)
    @NotNull
    @Column(name = "munnm", nullable = false, length = 80)
    private String munnm;

    @Size(max = 2)
    @Column(name = "sguf", length = 2)
    private String sguf;

    @Column(name = "terid")
    private Integer terid;

    @NotNull
    @Column(name = "stcancelado", nullable = false)
    private Character stcancelado;

}