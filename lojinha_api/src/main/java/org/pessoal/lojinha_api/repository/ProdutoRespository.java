package org.pessoal.lojinha_api.repository;

import org.pessoal.lojinha_api.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRespository extends JpaRepository<Produto, Integer> {
}
