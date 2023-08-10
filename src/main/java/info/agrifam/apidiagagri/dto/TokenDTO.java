package info.agrifam.apidiagagri.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TokenDTO {

    private String token;
    private String validity;
    private String login;
    private String email;
    private String nome;
    private int idpessoacadastrador;
}
