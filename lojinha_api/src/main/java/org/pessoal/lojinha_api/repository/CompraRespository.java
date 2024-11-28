package org.pessoal.lojinha_api.repository;

import org.pessoal.lojinha_api.domain.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRespository extends JpaRepository<Compra, Integer> {
}
