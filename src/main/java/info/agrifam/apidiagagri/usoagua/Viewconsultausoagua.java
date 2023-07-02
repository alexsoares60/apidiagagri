package info.agrifam.apidiagagri.usoagua;

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
@Table(name = "viewconsultausoagua")
public class Viewconsultausoagua {
    @Id
    @NotNull
    @Column(name = "idusudaagua", nullable = false)
    private Integer idusudaagua;


    @Column(name = "fazdownload")
    private Character fazdownload;

    @Size(max = 32)
    @Column(name = "logindownload", length = 32)
    private String logindownload;

    @NotNull
    @Column(name = "idcaracterizacaoupf", nullable = false)
    private Integer idcaracterizacaoupf;

    @Size(max = 20)
    @Column(name = "latitude", length = 20)
    private String latitude;

    @Size(max = 20)
    @Column(name = "longitude", length = 20)
    private String longitude;

    @Size(max = 80)
    @Column(name = "nomepropriedade", length = 80)
    private String nomepropriedade;

    @Size(max = 200)
    @NotNull
    @Column(name = "agricultor", nullable = false, length = 200)
    private String agricultor;

    @Column(name = "genero")
    private Character genero;

    @Size(max = 256)
    @NotNull
    @Column(name = "email", nullable = false, length = 256)
    private String email;

    @Size(max = 16)
    @Column(name = "celular", length = 16)
    private String celular;

    @Size(max = 80)
    @NotNull
    @Column(name = "municipio", nullable = false, length = 80)
    private String municipio;

    @Column(name = "munid")
    private Integer munid;

    @NotNull
    @Column(name = "fonteagua", nullable = false)
    private Integer fonteagua;

    @NotNull
    @Column(name = "stsedentacao", nullable = false)
    private Character stsedentacao;

    @NotNull
    @Column(name = "stirrigacao", nullable = false)
    private Character stirrigacao;

    @NotNull
    @Column(name = "stequipamentos", nullable = false)
    private Character stequipamentos;

    @Size(max = 21)
    @NotNull
    @Column(name = "descusuagua", nullable = false, length = 21)
    private String descusuagua;

    @Column(name = "idmobile")
    private Integer idmobile;

}