package info.agrifam.apidiagagri.areaconhecimento;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbmunicaracareaconhec")
public class Caracareaconhec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "idcaracterizacao", nullable = false)
    private Integer idcaracterizacao;

    @Column(name = "idareadeconhecimento")
    private Integer idareadeconhecimento;

    @Size(max = 200)
    @Column(name = "descmotivo", length = 200)
    private String descmotivo;

    @Column(name = "idmobile")
    private Integer idmobile;

    @Column(name = "stcancelado")
    private Character stcancelado;

    @Size(max = 255)
    @Column(name = "logincreate")
    private String logincreate;

    @Size(max = 255)
    @Column(name = "desc_motivo")
    private String descMotivo;

    @Column(name = "id_mobile")
    private Long idMobile;

}