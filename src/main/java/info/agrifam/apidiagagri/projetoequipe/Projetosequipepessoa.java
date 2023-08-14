package info.agrifam.apidiagagri.projetoequipe;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "view_projetosequipepessoa")
public class Projetosequipepessoa {
    @Id
    @NotNull
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "idpessoa", nullable = false)
    private Long idpessoa;

    @NotNull
    @Column(name = "idprojeto", nullable = false)
    private Integer idprojeto;

    @NotNull
    @Column(name = "tpfuncao", nullable = false)
    private Integer tpfuncao;

    @Size(max = 200)
    @NotNull
    @Column(name = "nome", nullable = false, length = 200)
    private String nome;

}