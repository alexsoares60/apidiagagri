package info.agrifam.apidiagagri.identificacaoupf;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewIdentificacaoupfprodutoRepository extends JpaRepository<ViewIdentificacaoupfproduto, String> {
    List<ViewIdentificacaoupfproduto> findByIdupf(Integer argidupf);
}