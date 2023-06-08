package info.agrifam.apidiag.userprojetos;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbusersprojects")
public class ProjetosUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "login", nullable = false)
    private String login;

    @NotNull
    @Column(name = "idprojeto", nullable = false)
    private Integer idprojeto;

    @NotNull
    @Column(name = "stcancelado", nullable = false)
    private Character stcancelado;

}