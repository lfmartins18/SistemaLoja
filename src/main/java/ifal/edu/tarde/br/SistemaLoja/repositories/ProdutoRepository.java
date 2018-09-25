package ifal.edu.tarde.br.SistemaLoja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ifal.edu.tarde.br.SistemaLoja.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}


