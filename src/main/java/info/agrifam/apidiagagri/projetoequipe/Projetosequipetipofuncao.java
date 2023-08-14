package info.agrifam.apidiagagri.projetoequipe;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbprojetosequipetipofuncao")
public class Projetosequipetipofuncao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtprojetosequipetipofuncao", nullable = false)
    private Integer id;

    @Size(max = 45)
    @NotNull
    @Column(name = "descricao_tipo_funcao", nullable = false, length = 45)
    private String descricaoTipoFuncao;

}