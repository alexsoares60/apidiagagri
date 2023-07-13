package info.agrifam.apidiagagri.diagnosticos;

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
@Table(name = "tbupfcaract")
public class Caracterizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcaracterizacaoupf", nullable = false)
    private Integer id;

    @Column(name = "munid")
    private Integer munid;

    @NotNull
    @Column(name = "dtcaracterizacaoupf", nullable = false)
    private LocalDate dtcaracterizacaoupf;

    @Column(name = "idpessoatecnicoelaborador")
    private Integer idpessoatecnicoelaborador;

    @Lob
    @Column(name = "espectativaater")
    private String espectativaater;

    @Column(name = "tpcaracterizacao")
    private Integer tpcaracterizacao;

    @Size(max = 2)
    @Column(name = "uf", length = 2)
    private String uf;

    @Column(name = "tpcadastro")
    private Character tpcadastro;

    @NotNull
    @Column(name = "idpessoachefefamilia", nullable = false)
    private Integer idpessoachefefamilia;

    @Column(name = "idmobile")
    private Integer idmobile;

    @Column(name = "idpessoachefefamiliamobile")
    private Integer idpessoachefefamiliamobile;
    @Column(name = "idempresaater")
    private Integer idempresaater;
    @NotNull
    @Column(name = "stcancelado", nullable = false)
    private Character stcancelado;

    @Size(max = 32)
    @Column(name = "login", length = 32)
    private String login;
    @Column(name = "fazdownload")
    private Character fazdownload;

    @Size(max = 32)
    @Column(name = "login_download", length = 32)
    private String loginDownload;

    @Column(name = "dtalteracao")
    private Instant dtalteracao;

    @Column(name = "idprojeto")
    private Integer idprojeto;

}