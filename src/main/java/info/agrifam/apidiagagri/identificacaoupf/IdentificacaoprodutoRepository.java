package info.agrifam.apidiagagri.identificacaoupf;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IdentificacaoprodutoRepository extends JpaRepository<Identificacaoproduto, IdentificacaoprodutoId> {
    public List<Identificacaoproduto> findByIdIdupf(Integer idupf);
}