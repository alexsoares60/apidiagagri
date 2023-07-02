package info.agrifam.apidiagagri.areasprodutivas;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "tbmunicaracareasprodutivas", schema = "agrifa04_diagmunicipal")
public class CaracterizacaoAreasProdutivas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(nullable = false)
    private Integer identificacaoid;

    private Integer idcaracterizacao;

    @Size(max = 50)
    @NotNull
    @Column(name = "descarea", nullable = false, length = 50)
    private String descarea;

    @NotNull
    @Column(name = "tamanhoha", nullable = false, precision = 10, scale = 2)
    private BigDecimal tamanhoha;

    @NotNull
    @Column(name = "upfidproduto", nullable = false)
    private Integer upfidproduto;

    @NotNull
    @Column(name = "idmobile", nullable = false)
    private Integer idmobile;

    @Size(max = 255)
    @Column(name = "login")
    private String login;

    @Column(name = "dtpreparosolo")
    private Timestamp dtpreparosolo;

    @Column(name = "dtestimadacolheita")
    private Timestamp dtestimadacolheita;

    @NotNull
    @Column(name = "dtcreated", nullable = false)
    private Timestamp dtcreated;

    @Column(name = "dtalteracao")
    private Timestamp dtalteracao;

    @Column(name = "stcancelado")
    private Character stcancelado;

    @Size(max = 2)
    @Column(name = "upfuf", length = 2)
    private String upfuf;

    @Column(name = "munid")
    private Integer munid;

    @Size(max = 45)
    @Column(name = "upfnmproduto", length = 45)
    private String upfnmproduto;

    @Column(name = "idcomunidade")
    private Integer idcomunidade;

    @Column(name = "pessoaid")
    private Integer pessoaid;

}