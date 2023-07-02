package info.agrifam.apidiagagri.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;

@Service
public class JwtService {

    @Value("${security.jwt.expiration}")
    private int expiration;
    @Value("${security.jwt.key}")
    private String key;

    public String generateToken(String username){

        Calendar currentTimeNow = Calendar.getInstance();
        currentTimeNow.add(Calendar.HOUR, expiration);
        Date expirationDate = currentTimeNow.getTime();
        int days = 10;
        long time = days * 24 /*horas*/ * 60 /*min*/ * 60 /*seg*/ * 1000  /*milis*/;
         expirationDate = new Date(System.currentTimeMillis() + time);

        SecretKey secretKey = getSecretKey();

        return Jwts.builder()
                .setSubject(username)
                .setExpiration(expirationDate)
                .signWith(secretKey)
                .compact();
    }

    private SecretKey getSecretKey() {
        return Keys.hmacShaKeyFor(key.getBytes(StandardCharsets.UTF_8));
    }

    private Claims getClaims(String token){
        SecretKey secretKey = getSecretKey();

        return Jwts.parserBuilder()
                .setSigningKey(secretKey)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    public String getUserName(String token) {
        return getClaims(token).getSubject();
    }
}
