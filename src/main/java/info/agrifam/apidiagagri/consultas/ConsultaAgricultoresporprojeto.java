package info.agrifam.apidiagagri.consultas;

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
@Table(name = "view_agricultoresporprojetos")
public class ConsultaAgricultoresporprojeto {
   @Id
//   @Column(name="UUID")

    @Column(name = "id")
    private String id;

    @NotNull
    @Column(name = "idpessoa", nullable = false)
    private Integer idpessoa;

    @Size(max = 8)
    @Column(name = "pescep", length = 8)
    private String pescep;

    @Size(max = 100)
    @Column(name = "peslogradouro", length = 100)
    private String peslogradouro;

    @Column(name = "idcomunidade")
    private Integer idcomunidade;

    @NotNull
    @Column(name = "munid", nullable = false)
    private Integer munid;

    @Size(max = 2)
    @Column(name = "sguf", length = 2)
    private String sguf;

    @Size(max = 200)
    @NotNull
    @Column(name = "pesnm", nullable = false, length = 200)
    private String pesnm;

    @Size(max = 14)
    @NotNull
    @Column(name = "pesnrcpfcnpj", nullable = false, length = 14)
    private String pesnrcpfcnpj;

    @Size(max = 50)
    @Column(name = "apelido", length = 50)
    private String apelido;

    @Size(max = 16)
    @Column(name = "pestelefone", length = 16)
    private String pestelefone;

    @Size(max = 16)
    @Column(name = "pescelular", length = 16)
    private String pescelular;

    @Size(max = 256)
    @NotNull
    @Column(name = "pesemail", nullable = false, length = 256)
    private String pesemail;

    @Column(name = "pessexo")
    private Character pessexo;

    @Size(max = 2083)
    @Column(name = "pescaminhofoto", length = 2083)
    private String pescaminhofoto;

    @NotNull
    @Column(name = "stativo", nullable = false)
    private Short stativo;

    @Column(name = "dtnascimento")
    private LocalDate dtnascimento;

    @Column(name = "fazdownload")
    private Character fazdownload;

    @Size(max = 32)
    @Column(name = "login_download", length = 32)
    private String loginDownload;

    @NotNull
    @Column(name = "idprojeto", nullable = false)
    private Integer idprojeto;

    @Size(max = 32)
    @Column(name = "login", length = 32)
    private String login;

    @Size(max = 80)
    @NotNull
    @Column(name = "tituloprojeto", nullable = false, length = 80)
    private String tituloprojeto;

    @Size(max = 80)
    @NotNull
    @Column(name = "munnm", nullable = false, length = 80)
    private String munnm;

    @Size(max = 100)
    @NotNull
    @Column(name = "dscomunidade", nullable = false, length = 100)
    private String dscomunidade;

}