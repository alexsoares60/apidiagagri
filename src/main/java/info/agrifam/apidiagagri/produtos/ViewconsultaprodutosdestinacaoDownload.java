package info.agrifam.apidiagagri.produtos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "viewconsultaprodutosdestinacao_download")
public class ViewconsultaprodutosdestinacaoDownload {
    @Id
    @Size(max = 36)
    @Column(name = "rownum", length = 36)
    private String rownum;

    @Column(name = "fazdownload")
    private Character fazdownload;

    @Size(max = 32)
    @Column(name = "logindownload", length = 32)
    private String logindownload;

    @Size(max = 200)
    @NotNull
    @Column(name = "agricultor", nullable = false, length = 200)
    private String agricultor;

    @NotNull
    @Column(name = "upfidproduto", nullable = false)
    private Integer upfidproduto;

    @Column(name = "upfcrcproddesttpproducao")
    private Short upfcrcproddesttpproducao;

    @NotNull
    @Column(name = "upfcrcproddestdestinacao", nullable = false)
    private Short upfcrcproddestdestinacao;

    @Size(max = 45)
    @NotNull
    @Column(name = "upfnmproduto", nullable = false, length = 45)
    private String upfnmproduto;

    @Size(max = 80)
    @NotNull
    @Column(name = "municipio", nullable = false, length = 80)
    private String municipio;

    @NotNull
    @Column(name = "munid", nullable = false)
    private Integer munid;

    @Size(max = 20)
    @Column(name = "latitude", length = 20)
    private String latitude;

    @Size(max = 20)
    @Column(name = "longitude", length = 20)
    private String longitude;

    @NotNull
    @Column(name = "idcaracterizacaoupf", nullable = false)
    private Integer idcaracterizacaoupf;

    @Size(max = 80)
    @Column(name = "nomepropriedade", length = 80)
    private String nomepropriedade;

    @Column(name = "idcomunidade")
    private Integer idcomunidade;

    @Column(name = "idmobile")
    private Integer idmobile;

    @NotNull
    @Column(name = "upfcrcproddestquantidade", nullable = false)
    private Double upfcrcproddestquantidade;

    @Size(max = 10)
    @Column(name = "upfcrcproddestunidade", length = 10)
    private String upfcrcproddestunidade;

    @NotNull
    @Column(name = "upfcrcproddeststorganico", nullable = false)
    private Short upfcrcproddeststorganico;

    @NotNull
    @Column(name = "cancelado", nullable = false)
    private Character cancelado;

    @Size(max = 60)
    @Column(name = "comunidade", length = 60)
    private String comunidade;

    @NotNull
    @Column(name = "id", nullable = false)
    private Long id;

}