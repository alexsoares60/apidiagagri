package info.agrifam.apidiagagri.produtos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

public interface ProdutosProjetoRepository extends JpaRepository<ProdutosProjeto, String> {
    Optional<List<ProdutosProjeto>> findByIdprojeto(Integer id);

//    Optional<List<ProdutosProjeto>> getComunidades(String argids);

    List<ProdutosProjeto> findByIdprojetoIn(@NonNull List<Integer> idprojetos);
}