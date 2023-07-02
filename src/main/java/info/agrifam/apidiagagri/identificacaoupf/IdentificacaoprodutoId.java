package info.agrifam.apidiagagri.identificacaoupf;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class IdentificacaoprodutoId implements Serializable {
    private static final long serialVersionUID = -8008859395741553301L;
    @NotNull
    @Column(name = "idupf", nullable = false)
    private Integer idupf;

    @NotNull
    @Column(name = "upfidproduto", nullable = false)
    private Integer upfidproduto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        IdentificacaoprodutoId entity = (IdentificacaoprodutoId) o;
        return Objects.equals(this.upfidproduto, entity.upfidproduto) &&
                Objects.equals(this.idupf, entity.idupf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upfidproduto, idupf);
    }

}