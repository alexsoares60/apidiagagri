package info.agrifam.apidiagagri.produtos;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbtupfprodutos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "upfidproduto", nullable = false)
    private Integer id;

    @Size(max = 45)
    @NotNull
    @Column(name = "upfprodutodescricao", nullable = false, length = 45)
    private String upfprodutodescricao;

    @NotNull
    @Column(name = "upftpproduto", nullable = false)
    private Short upftpproduto;

    @NotNull
    @Column(name = "stcancelado", nullable = false)
    private Character stcancelado;

}