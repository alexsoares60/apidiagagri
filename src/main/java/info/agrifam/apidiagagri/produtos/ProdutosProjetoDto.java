package info.agrifam.apidiag.produtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link ProdutosProjeto} entity
 */
@Data
public class ProdutosProjetoDto implements Serializable {
    @Size(max = 36)
    private final String id;
    @NotNull
    private final Integer idproduto;
    @NotNull
    private final Integer idprojeto;
    @Size(max = 45)
    @NotNull
    private final String descricao;
    @NotNull
    private final Short tipo;
    @NotNull
    private final Character cancelado;
}