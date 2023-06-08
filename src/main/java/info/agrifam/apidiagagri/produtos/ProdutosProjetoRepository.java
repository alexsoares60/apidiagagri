package info.agrifam.apidiag.produtos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProdutosProjetoRepository extends JpaRepository<ProdutosProjeto, String> {
    Optional<List<ProdutosProjeto>> findByIdprojeto(Integer id);
}