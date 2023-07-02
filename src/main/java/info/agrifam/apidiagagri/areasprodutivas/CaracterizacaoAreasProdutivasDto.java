package info.agrifam.apidiagagri.areasprodutivas;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * A DTO for the {@link CaracterizacaoAreasProdutivas} entity
 */
@Data
public class CaracterizacaoAreasProdutivasDto implements Serializable {
    private final Integer id;
    @NotNull
    private final Integer identificacaoid;

    private final Integer idcaracterizacao;
    @Size(max = 50)
    @NotNull
    private final String descarea;
    @NotNull
    private final BigDecimal tamanhoha;
    @NotNull
    private final Integer upfidproduto;
    @NotNull
    private final Integer idmobile;
    @Size(max = 255)
    private final String login;
    private final Timestamp dtpreparosolo;
    private final Timestamp dtestimadacolheita;
    @NotNull
    private final Timestamp dtcreated;
    private final Timestamp dtalteracao;
    private final Character stcancelado;
    @Size(max = 2)
    private final String upfuf;
    private final Integer munid;
    @Size(max = 45)
    private final String upfnmproduto;
    private final Integer idcomunidade;
    private final Integer pessoaid;
}