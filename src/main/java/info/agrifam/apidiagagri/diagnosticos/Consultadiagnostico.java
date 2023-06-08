package info.agrifam.apidiag.diagnosticos;

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
@Table(name = "vwconsultadiagnosticos")
public class Consultadiagnostico {
    @Id
    @NotNull
    @Column(name = "idcaracterizacaoupf", nullable = false)
    private Integer idcaracterizacaoupf;

    @NotNull
    @Column(name = "dtcaracterizacaoupf", nullable = false)
    private LocalDate dtcaracterizacaoupf;

    @NotNull
    @Column(name = "idpessoachefefamilia", nullable = false)
    private Integer idpessoachefefamilia;

    @Column(name = "idempresaater")
    private Integer idempresaater;

    @Column(name = "idpessoatecnicoelaborador")
    private Integer idpessoatecnicoelaborador;

    @Column(name = "tpcadastro")
    private Character tpcadastro;

    @Size(max = 200)
    @NotNull
    @Column(name = "agricultor", nullable = false, length = 200)
    private String agricultor;

    @Size(max = 200)
    @NotNull
    @Column(name = "cadastrador", nullable = false, length = 200)
    private String cadastrador;

    @Size(max = 80)
    @NotNull
    @Column(name = "munnm", nullable = false, length = 80)
    private String munnm;

    @Size(max = 2)
    @Column(name = "sguf", length = 2)
    private String sguf;

    @Column(name = "munid")
    private Integer munid;

    @NotNull
    @Column(name = "datadiag", nullable = false)
    private LocalDate datadiag;

    @NotNull
    @Column(name = "stcancelado", nullable = false)
    private Character stcancelado;

    @Size(max = 32)
    @Column(name = "login", length = 32)
    private String login;

    @Size(max = 14)
    @NotNull
    @Column(name = "cpf", nullable = false, length = 14)
    private String cpf;

    @Size(max = 18)
    @Column(name = "cpf_commascara", length = 18)
    private String cpfCommascara;

}