package info.agrifam.apidiagagri.secuser;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link SecUser} entity
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SecUserDto implements Serializable {
    @Size(max = 255)
    private  String id;
    @Size(max = 64)
    private  String name;
    @Size(max = 255)
    private  String email;
    @Size(max = 1)
    private  String active;
    @Size(max = 1)
    private  String privAdmin;
//    private  byte[] picture;
    @NotNull
    private  Short tipousuarioater;
    private  Integer idpessoaUsuario;
    @Size(max = 32)
    private  String loginAtivadordousuario;
    @Size(max = 2083)
    private  String urlfoto;
    @Size(max = 400)
    private String idmunicipio;
}