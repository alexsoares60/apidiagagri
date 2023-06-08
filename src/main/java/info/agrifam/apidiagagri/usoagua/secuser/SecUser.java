package info.agrifam.apidiagagri.secuser;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
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
@Table(name = "sec_users")
public class SecUser {
    @Id
    @Size(max = 255)
    @Column(name = "login", nullable = false)
    private String id;
    @Size(max = 255)
    @Column(name = "pswd")
    private String password;
    @Size(max = 64)
    @Column(name = "name", length = 64)
    private String name;

    @Size(max = 255)
    @Column(name = "email")
    private String email;

    @Size(max = 1)
    @Column(name = "active", length = 1)
    private String active;

    @Size(max = 1)
    @Column(name = "priv_admin", length = 1)
    private String privAdmin;

//    @Column(name = "picture")
//    private byte[] picture;

    @NotNull
    @Column(name = "tipousuarioater", nullable = false)
    private Short tipousuarioater;

    @Column(name = "idpessoa_usuario")
    private Integer idpessoaUsuario;

    @Size(max = 32)
    @Column(name = "login_ativadordousuario", length = 32)
    private String loginAtivadordousuario;

    @Size(max = 2083)
    @Column(name = "urlfoto", length = 2083)
    private String urlfoto;

    @Size(max = 400)
    @Column(name = "idmunicipio")
    private String idmunicipio;


    @Size(max = 32)
    @Column(name = "activation_code", length = 32)
    private String activationCode;

    @Size(max = 255)
    @Column(name = "mfa")
    private String mfa;

    @Size(max = 255)
    @Column(name = "senhabcrypt")
    private String senhabcrypt;

}