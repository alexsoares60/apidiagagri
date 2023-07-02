package info.agrifam.apidiagagri.municipios;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class UsuariosmunicipioId implements Serializable {
    private static final long serialVersionUID = -4351723317941499685L;
    @NotNull
    @Column(name = "munid", nullable = false)
    private Integer munid;

    @Size(max = 32)
    @NotNull
    @Column(name = "login", nullable = false, length = 32)
    private String login;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UsuariosmunicipioId entity = (UsuariosmunicipioId) o;
        return Objects.equals(this.munid, entity.munid) &&
                Objects.equals(this.login, entity.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(munid, login);
    }

}