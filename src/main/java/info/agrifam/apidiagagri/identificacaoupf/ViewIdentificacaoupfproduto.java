package info.agrifam.apidiagagri.identificacaoupf;

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
@Table(name = "view_identificacaoupfprodutos")
public class ViewIdentificacaoupfproduto {
    @Id
    @Size(max = 36)
    @Column(name = "id", length = 36)
    private String id;

    @NotNull
    @Column(name = "idupf", nullable = false)
    private Integer idupf;

    @NotNull
    @Column(name = "idproduto", nullable = false)
    private Integer idproduto;

    @NotNull
    @Column(name = "cancelado", nullable = false)
    private Character cancelado;

    @Size(max = 45)
    @NotNull
    @Column(name = "descricao", nullable = false, length = 45)
    private String descricao;

    @NotNull
    @Column(name = "tpproduto", nullable = false)
    private Short tpproduto;

    @NotNull
    @Column(name = "stcancelado", nullable = false)
    private Character stcancelado;

}