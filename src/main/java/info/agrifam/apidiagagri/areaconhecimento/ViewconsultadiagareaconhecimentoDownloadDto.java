package info.agrifam.apidiagagri.areaconhecimento;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link ViewconsultadiagareaconhecimentoDownload} entity
 */
@Data
public class ViewconsultadiagareaconhecimentoDownloadDto implements Serializable {
    @Size(max = 36)
    private final String rownum;
    private final Character fazdownload;
    @Size(max = 32)
    private final String logindownload;
    @NotNull
    private final Integer idcaracterizacaoupf;
    @NotNull
    private final Integer id;
    @Size(max = 20)
    private final String latitude;
    @Size(max = 20)
    private final String longitude;
    @Size(max = 80)
    private final String nomepropriedade;
    @Size(max = 200)
    @NotNull
    private final String agricultor;
    private final Character genero;
    @Size(max = 256)
    @NotNull
    private final String email;
    @Size(max = 16)
    private final String celular;
    @Size(max = 80)
    @NotNull
    private final String municipio;
    private final Integer munid;
    private final Integer idareadeconhecimento;
    @Size(max = 80)
    @NotNull
    private final String nmareadeconhecimento;
    private final Integer idmobile;
    @Size(max = 200)
    private final String descmotivo;
    @NotNull
    private final Character cancelado;
    @Size(max = 60)
    private final String comunidade;
}