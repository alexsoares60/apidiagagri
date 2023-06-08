package info.agrifam.apidiag.identificacaoupf;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbidentificacaoprodutos")
public class Identificacaoproduto {
    @EmbeddedId
    private IdentificacaoprodutoId id;

    @NotNull
    @Column(name = "stcancelado", nullable = false)
    private Character stcancelado;

}