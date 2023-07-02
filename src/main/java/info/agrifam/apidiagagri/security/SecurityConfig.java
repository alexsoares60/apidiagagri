package info.agrifam.apidiagagri.security;

import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.filter.OncePerRequestFilter;
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig  {
//    @Bean
//
//    public static BCryptPasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//
//    }
    @Bean
     public static PasswordEncoder passwordEncoder() {
        return new MessageDigestPasswordEncoder("MD5");
    }
    @Autowired
    private CustomUserDetailService userDetailService;

    @Autowired
    private JwtService jwtService;

    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity http,
                                                       PasswordEncoder passwordEncoder,
                                                       CustomUserDetailService userDetailsService) throws Exception {
        return http.getSharedObject(AuthenticationManagerBuilder.class)
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder)
                .and()
                .build();
    }

    @Bean
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception{
        http.csrf().disable().authorizeHttpRequests( (authorize) -> {
                    try {
                        authorize
                                .requestMatchers("/api/v1/login").permitAll()
                                .anyRequest().authenticated().and()
                                .sessionManagement()
                                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                                .and()
                                .addFilterBefore(jwtFilter(), UsernamePasswordAuthenticationFilter.class);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
        )
                 ;
        return http.build();
    }

    public OncePerRequestFilter jwtFilter(){
        return new JwtAuthFilter(jwtService, userDetailService);
    }
}
