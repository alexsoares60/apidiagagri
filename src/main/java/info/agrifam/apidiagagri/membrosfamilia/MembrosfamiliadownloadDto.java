package info.agrifam.apidiagagri.membrosfamilia;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link Membrosfamiliadownload} entity
 */
@Data
public class MembrosfamiliadownloadDto implements Serializable {
    @Size(max = 36)
    private final Long id;
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
    private final Short stativo;
    @NotNull
    private final Integer munid;
    @NotNull
    private final Integer idmobile;
    @NotNull
    private final Integer idcaracterizacaoupf;
    @NotNull
    private final Long idpessoa;
    @NotNull
    private final Character cancelado;
    private final Character fazdownload;
    @NotNull
    private final Character stcancelado;
    @Size(max = 50)
    @NotNull
    private final String logincreate;
    private final String logindownload;

}