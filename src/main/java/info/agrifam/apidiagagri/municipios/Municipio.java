package info.agrifam.apidiagagri.municipios;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbmunicipios")
public class Municipio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "munid", nullable = false)
    private Integer id;

    @Column(name = "terid")
    private Integer terid;

    @Column(name = "sguf")
    private String sguf;

    @Size(max = 80)
    @NotNull
    @Column(name = "munnm", nullable = false, length = 80)
    private String munnm;

}