package info.agrifam.apidiag.consultas;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link Consultamembrosfamilia} entity
 */
@Data
public class ConsultamembrosfamiliaDto implements Serializable {
    @Size(max = 36)
    private final String nrlinha;
    @Size(max = 200)
    @NotNull
    private final String pesnm;
    @Size(max = 16)
    private final String pescelular;
    @Size(max = 256)
    @NotNull
    private final String pesemail;
    private final Character pessexo;
    @NotNull
    private final LocalDate dtcaracterizacaoupf;
    private final Integer tPcaracterizacao;
    @NotNull
    private final Character stparentesco;
    @NotNull
    private final Short idetinia;
    @NotNull
    private final Character stestuda;
    @NotNull
    private final Character idgrauescolaridade;
    @NotNull
    private final Short sTativo;
    @NotNull
    private final Integer munid;
    @NotNull
    private final Integer idmobile;
    @NotNull
    private final Integer idcaracterizacaoupf;
    @NotNull
    private final Integer idpessoa;
    @NotNull
    private final Character cancelado;
    @NotNull
    private final Character stcancelado;
    @Size(max = 50)
    @NotNull
    private final String logincreate;
}