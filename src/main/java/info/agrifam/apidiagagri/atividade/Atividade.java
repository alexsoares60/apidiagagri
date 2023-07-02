package info.agrifam.apidiagagri.atividade;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tbatividades")
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "atvid", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Column(name = "atvdescricao", length = 100)
    private String atvdescricao;

    @Column(name = "stcancelado")
    private Character stcancelado;

}