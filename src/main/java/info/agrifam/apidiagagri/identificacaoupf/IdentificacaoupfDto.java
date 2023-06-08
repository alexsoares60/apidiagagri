package info.agrifam.apidiag.identificacaoupf;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link Identificacaoupf} entity
 */
@Data
public class IdentificacaoupfDto implements Serializable {
    private final Integer id;
    @NotNull
    private final Integer idcaracterizacaoupf;
    @Size(max = 2)
    @NotNull
    private final String upfUF;
    @NotNull
    private final Integer munid;
    @NotNull
    private final Integer idpessoa;
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
    @Size(max = 32)
    private final String logincreate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private final LocalDateTime updateTime;
//    LocalDateTime localDateTime = LocalDateTime.now();
//    LocalTime localTime = localDateTime.toLocalTime();
    private final Character stcancelado;
}