package info.agrifam.apidiagagri.pessoas;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tbpessoas")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpessoa", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "pestppessoa", nullable = false)
    private Integer pestppessoa;

    @Size(max = 8)
    @Column(name = "pescep", length = 8)
    private String pescep;

    @Size(max = 100)
    @Column(name = "peslogradouro", length = 100)
    private String peslogradouro;

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

    @Column(name = "idempresaater", columnDefinition = "INT UNSIGNED ZEROFILL(10)")
    private Object idempresaater;

    @Column(name = "idpessoascadastradormunicipal")
    private Integer idpessoascadastradormunicipal;

    @NotNull
    @Column(name = "stativo", nullable = false)
    private Short stativo;

    @Size(max = 100)
    @Column(name = "motivodesativar", length = 100)
    private String motivodesativar;

    @Column(name = "idmobile")
    private Integer idmobile;

    @Column(name = "dtnascimento")
    private LocalDate dtnascimento;

    @Size(max = 45)
    @Column(name = "logincreate", length = 45)
    private String logincreate;

    @Column(name = "id_pessoas_cadastrador_municipal")
    private Long idPessoasCadastradorMunicipal;

    @Column(name = "idempresa_ater")
    private Long idempresaAter;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "update_time")
    private Instant updateTime;

    @Column(name = "idcomunidade")
    private Integer idcomunidade;

    @Column(name = "fazdownload")
    private Character fazdownload;

    @Size(max = 32)
    @Column(name = "login_download", length = 32)
    private String loginDownload;

}