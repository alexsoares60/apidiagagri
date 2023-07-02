package info.agrifam.apidiagagri.membrosfamilia;

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
@Table(name = "viewmembrosfamiliadownload")
public class Membrosfamiliadownload {
    @Id
    @Column(name = "id")
    private Long id;

    @Size(max = 200)
    @NotNull
    @Column(name = "pesnm", nullable = false, length = 200)
    private String pesnm;

    @Size(max = 16)
    @Column(name = "pescelular", length = 16)
    private String pescelular;

    @Size(max = 256)
    @NotNull
    @Column(name = "pesemail", nullable = false, length = 256)
    private String pesemail;

    @Column(name = "pessexo")
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
    @Column(name = "stativo", nullable = false)
    private Short stativo;

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
    private Long idpessoas;

    @NotNull
    @Column(name = "cancelado", nullable = false)
    private Character cancelado;

    @Column(name = "fazdownload")
    private Character fazdownload;

    @NotNull
    @Column(name = "stcancelado", nullable = false)
    private Character stcancelado;

    @Size(max = 50)
    @NotNull
    @Column(name = "logincreate", nullable = false, length = 50)
    private String logincreate;

    @Size(max = 32)
    @Column(name = "logindownload", length = 32)
    private String logindownload;

    @Size(max = 8)
    @Column(name = "pescep", length = 8)
    private String pescep;

    @NotNull
    @Column(name = "pestppessoa", nullable = false)
    private Integer pestppessoa;

    @Size(max = 100)
    @Column(name = "peslogradouro", length = 100)
    private String peslogradouro;

    @Size(max = 2)
    @Column(name = "sguf", length = 2)
    private String sguf;

    @Size(max = 14)
    @NotNull
    @Column(name = "pesnrcpfcnpj", nullable = false, length = 14)
    private String pesnrcpfcnpj;

    @Column(name = "idcomunidade")
    private Integer idcomunidade;

    @Size(max = 50)
    @Column(name = "apelido", length = 50)
    private String apelido;

    @Column(name = "dtnascimento")
    private LocalDate dtnascimento;

}