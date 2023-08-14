package info.agrifam.apidiagagri.projetoequipe;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbprojetosequipe")
public class Projetosequipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "idprojeto", nullable = false)
    private Integer idprojeto;

    @NotNull
    @Column(name = "idpessoa", nullable = false)
    private Long idpessoa;

    @NotNull
    @Column(name = "tpfuncao", nullable = false)
    private Integer tpfuncao;

}