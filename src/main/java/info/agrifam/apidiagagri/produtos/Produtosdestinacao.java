package info.agrifam.apidiagagri.produtos;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbupfcrcprodutosdestinacao")
public class Produtosdestinacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "idcaracterizacaoupf", nullable = false)
    private Integer idcaracterizacaoupf;

    @NotNull
    @Column(name = "upfidproduto", nullable = false)
    private Integer upfidproduto;

    @NotNull
    @Column(name = "upfcrcproddeststorganico", nullable = false)
    private Short upfcrcproddeststorganico;

    @Column(name = "upfcrcproddesttpproducao")
    private Short upfcrcproddesttpproducao;

    @NotNull
    @Column(name = "upfcrcproddestdestinacao", nullable = false)
    private Short upfcrcproddestdestinacao;

    @NotNull
    @Column(name = "upfcrcproddestquantidade", nullable = false)
    private Double upfcrcproddestquantidade;

    @Size(max = 10)
    @Column(name = "upfcrcproddestunidade", length = 10)
    private String upfcrcproddestunidade;

    @Column(name = "idmobile")
    private Integer idmobile;

    @Column(name = "stcancelado")
    private Character stcancelado;

    @Column(name = "id_mobile")
    private Long idmobilea;

    @Size(max = 32)
    @Column(name = "login", length = 32)
    private String login;

}