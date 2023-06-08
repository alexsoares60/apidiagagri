package info.agrifam.apidiag.areaconhecimento;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbmuniareaconhecimento")
public class Areaconhecimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idareadeconhecimento", nullable = false)
    private Integer id;

    @Size(max = 80)
    @NotNull
    @Column(name = "nmareadeconhecimento", nullable = false, length = 80)
    private String nmareadeconhecimento;

    @Size(max = 400)
    @Column(name = "descareadeconhecimento", length = 400)
    private String descareadeconhecimento;

    @NotNull
    @Column(name = "stcancelado", nullable = false)
    private Character stcancelado;

}