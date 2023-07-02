package info.agrifam.apidiagagri.membrosfamilia;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbupfcrcmembrosfamilia")
public class Membrosfamilia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "idcaracterizacaoupf", nullable = false)
    private Integer idcaracterizacaoupf;

    @NotNull
    @Column(name = "idpessoa", nullable = false)
    private Long idpessoa;

    @NotNull
    @Column(name = "stparentesco", nullable = false)
    private Character stparentesco;

    @NotNull
    @Column(name = "idetinia", nullable = false)
    private Short idetinia;

    @NotNull
    @Column(name = "stestuda", nullable = false)
    private Character stestuda;

    @NotNull
    @Column(name = "idgrauescolaridade", nullable = false)
    private Character idgrauescolaridade;

    @NotNull
    @Column(name = "idmobile", nullable = false)
    private Integer idmobile;

    @NotNull
    @Column(name = "stenviado", nullable = false)
    private Integer stenviado;

    @NotNull
    @Column(name = "stcancelado", nullable = false)
    private Character stcancelado;

    @Size(max = 50)
    @NotNull
    @Column(name = "logincreate", nullable = false, length = 50)
    private String logincreate;

}