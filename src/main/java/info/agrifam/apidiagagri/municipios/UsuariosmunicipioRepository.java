package info.agrifam.apidiag.municipios;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuariosmunicipioRepository extends JpaRepository<Usuariosmunicipio, String> {
    List<Usuariosmunicipio> findByLogin(String login);
}