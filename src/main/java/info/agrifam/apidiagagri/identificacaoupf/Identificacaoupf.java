package info.agrifam.apidiagagri.identificacaoupf;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tbidentificacaoupf")
public class Identificacaoupf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idupf", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "idcaracterizacaoupf", nullable = false)
    private Integer idcaracterizacaoupf;

    @Size(max = 2)
    @NotNull
    @Column(name = "upfUF", nullable = false, length = 2)
    private String upfUF;

    @NotNull
    @Column(name = "munid", nullable = false)
    private Integer munid;

    @NotNull
    @Column(name = "idpessoa", nullable = false)
    private Integer idpessoa;

    @Size(max = 60)
    @Column(name = "upfcomunidade", length = 60)
    private String upfcomunidade;

    @Size(max = 80)
    @Column(name = "upfnomepropriedade", length = 80)
    private String upfnomepropriedade;

    @Column(name = "upfdistanciadasedemunicipio", precision = 10, scale = 2)
    private BigDecimal upfdistanciadasedemunicipio;

    @Column(name = "upfdistanciadomunicipiomaisproximo", precision = 10, scale = 2)
    private BigDecimal upfdistanciadomunicipiomaisproximo;

    @Column(name = "upfcoordenadasquadrante")
    private Float upfcoordenadasquadrante;

    @Size(max = 20)
    @Column(name = "upfcoordenadaslatitude", length = 20)
    private String upfcoordenadaslatitude;

    @Size(max = 20)
    @Column(name = "upfcoordenadaslongitude", length = 20)
    private String upfcoordenadaslongitude;

    @Column(name = "upfaltitudemetros", precision = 10, scale = 2)
    private BigDecimal upfaltitudemetros;

    @Size(max = 800)
    @Column(name = "upfrotaacesso", length = 800)
    private String upfrotaacesso;

    @Column(name = "upftipoacessoterra")
    private Integer upftipoacessoterra;

    @Size(max = 300)
    @Column(name = "upfcroqui", length = 300)
    private String upfcroqui;

    @Column(name = "idcomunidade")
    private Integer idcomunidade;

    @Column(name = "idmobile")
    private Integer idmobile;

    @NotNull
    @Column(name = "tamanhoha", nullable = false, precision = 10, scale = 2)
    private BigDecimal tamanhoha;

    @Column(name = "id_mobile")
    private Long idMobile;

    @Size(max = 32)
    @Column(name = "logincreate", length = 32)
    private String logincreate;

//    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_time", columnDefinition = "TIMESTAMP")
//    @FutureOrPresent(message = ErrorMessages.INVALID_CAMPAIGN_START_DATE)
//    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private  LocalDateTime updateTime;
  //  private Instant updateTime;

    @Column(name = "stcancelado")
    private Character stcancelado;

}