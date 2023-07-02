package info.agrifam.apidiagagri.usoagua;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbaterpecusudaagua")
public class Aterpecusudaagua {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusudaagua", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "idcaracterizacaoupf", nullable = false)
    private Integer idcaracterizacaoupf;

    @NotNull
    @Column(name = "upfcrctipofonteagua", nullable = false)
    private Integer upfcrctipofonteagua;

    @NotNull
    @Column(name = "stdessendentacaoanimal", nullable = false)
    private Character stdessendentacaoanimal;

    @NotNull
    @Column(name = "stirrigacao", nullable = false)
    private Character stirrigacao;

    @NotNull
    @Column(name = "stlimpezadeequipamentos", nullable = false)
    private Character stlimpezadeequipamentos;

    @Column(name = "idmobile")
    private Integer idmobile;

    @Column(name = "stcancelado")
    private Character stcancelado;

}