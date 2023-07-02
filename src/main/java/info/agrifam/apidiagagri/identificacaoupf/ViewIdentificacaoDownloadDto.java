package info.agrifam.apidiagagri.identificacaoupf;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A DTO for the {@link ViewIdentificacaoDownload} entity
 */
@Data
public class ViewIdentificacaoDownloadDto implements Serializable {
    @NotNull
    private final Integer idupf;
    private final Character fazdownload;
    @Size(max = 32)
    private final String loginDownload;
    @NotNull
    private final Integer idcaracterizacaoupf;
    @Size(max = 2)
    @NotNull
    private final String upfUF;
    @NotNull
    private final Integer munid;
    @NotNull
    private final Long idpessoa;
    @Size(max = 60)
    private final String upfcomunidade;
    @Size(max = 80)
    private final String upfnomepropriedade;
    private final BigDecimal upfdistanciadasedemunicipio;
    private final BigDecimal upfdistanciadomunicipiomaisproximo;
    private final Float upfcoordenadasquadrante;
    @Size(max = 20)
    private final String upfcoordenadaslatitude;
    @Size(max = 20)
    private final String upfcoordenadaslongitude;
    private final BigDecimal upfaltitudemetros;
    @Size(max = 800)
    private final String upfrotaacesso;
    private final Integer upftipoacessoterra;
    @Size(max = 300)
    private final String upfcroqui;
    private final Integer idcomunidade;
    private final Integer idmobile;
    @NotNull
    private final BigDecimal tamanhoha;
    private final Character stcancelado;
}