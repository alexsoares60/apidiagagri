package info.agrifam.apidiag.consultas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.time.LocalDate;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "viewmembrosfamilia")
public class Consultamembrosfamilia {
    @Id
    @Size(max = 36)
    @Column(name = "nrlinha", length = 36)
    private String nrlinha;

    @Size(max = 200)
    @NotNull
    @Column(name = "pesnm", nullable = false, length = 200)
    private String pesnm;

    @Size(max = 16)
    @Column(name = "PESCELULAR", length = 16)
    private String pescelular;

    @Size(max = 256)
    @NotNull
    @Column(name = "PESEMAIL", nullable = false, length = 256)
    private String pesemail;

    @Column(name = "PESSEXO")
    private Character pessexo;

    @NotNull
    @Column(name = "dtcaracterizacaoupf", nullable = false)
    private LocalDate dtcaracterizacaoupf;

    @Column(name = "TPcaracterizacao")
    private Integer tPcaracterizacao;

    @NotNull
    @Column(name = "stparentesco", nullable = false)
    private Character stparentesco;

    @NotNull
    @Column(name = "idetinia", nullable = false)
    private Short idetinia;

    @NotNull
    @Column(name = "stestuda", nullable = false)
    private Character stestuda;

    @NotNull
    @Column(name = "idgrauescolaridade", nullable = false)
    private Character idgrauescolaridade;

    @NotNull
    @Column(name = "STativo", nullable = false)
    private Short sTativo;

    @NotNull
    @Column(name = "munid", nullable = false)
    private Integer munid;

    @NotNull
    @Column(name = "idmobile", nullable = false)
    private Integer idmobile;

    @NotNull
    @Column(name = "idcaracterizacaoupf", nullable = false)
    private Integer idcaracterizacaoupf;

    @NotNull
    @Column(name = "idpessoa", nullable = false)
    private Integer idpessoa;

    @NotNull
    @Column(name = "cancelado", nullable = false)
    private Character cancelado;

    @NotNull
    @Column(name = "stcancelado", nullable = false)
    private Character stcancelado;

    @Size(max = 50)
    @NotNull
    @Column(name = "logincreate", nullable = false, length = 50)
    private String logincreate;

}