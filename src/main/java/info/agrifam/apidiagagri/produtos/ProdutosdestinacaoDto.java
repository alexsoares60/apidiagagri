package info.agrifam.apidiagagri.produtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Produtosdestinacao} entity
 */
@Data
public class ProdutosdestinacaoDto implements Serializable {
    private final Long id;
    @NotNull
    private final Integer idcaracterizacaoupf;
    @NotNull
    private final Integer upfidproduto;
    @NotNull
    private final Short upfcrcproddeststorganico;
    private final Short upfcrcproddesttpproducao;
    @NotNull
    private final Short upfcrcproddestdestinacao;
    @NotNull
    private final Double upfcrcproddestquantidade;
    @Size(max = 10)
    private final String upfcrcproddestunidade;
    private final Integer idmobile;
    private final Character stcancelado;
    private final Long idmobilea;
    @Size(max = 32)
    private final String login;
}