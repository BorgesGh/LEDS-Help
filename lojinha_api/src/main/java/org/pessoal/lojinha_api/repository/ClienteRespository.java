package org.pessoal.lojinha_api.repository;

import org.pessoal.lojinha_api.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRespository extends JpaRepository<Cliente, Integer> {
}
