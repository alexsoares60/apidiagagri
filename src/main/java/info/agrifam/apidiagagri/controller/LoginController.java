package info.agrifam.apidiagagri.controller;


import info.agrifam.apidiagagri.dto.LoginDTO;
import info.agrifam.apidiagagri.dto.ResponseDTO;
import info.agrifam.apidiagagri.dto.TokenDTO;
import info.agrifam.apidiagagri.security.CustomUserDetailService;
import info.agrifam.apidiagagri.security.JwtService;
import info.agrifam.apidiagagri.usoagua.secuser.SecUser;
import info.agrifam.apidiagagri.usoagua.secuser.SecUserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;


@Controller
@RequestMapping("/api/v1/login")
public class LoginController {

    @Autowired
    private CustomUserDetailService userDetailService;

    @Autowired
    private JwtService jwtService;

    @Value("${security.jwt.expiration}")
    private String expiration;

    private  final SecUserRepository secUserRepository;

    private String nome;
    private String  email;

    public LoginController(SecUserRepository secUserRepository) {
        this.secUserRepository = secUserRepository;
    }


    @PostMapping()
    public ResponseEntity post(@Valid @RequestBody LoginDTO loginData){
        try{
            userDetailService.verifyUserCredentials(loginData);
            Optional<SecUser> secUser;
            secUser = secUserRepository.findById(loginData.getUsername());

            String token = jwtService.generateToken(loginData.getUsername());
            if (secUser.isPresent()) {
                System.out.printf(secUser.toString());
               nome = secUser.get().getName();
               email = secUser.get().getEmail();
            }
            return new ResponseEntity<>(new TokenDTO(token, expiration, loginData.getUsername(),email, nome ), HttpStatus.OK);

        } catch (Exception error){
            return new ResponseEntity<>(new ResponseDTO(error.getMessage()), HttpStatus.UNAUTHORIZED);
        }
    }
}
