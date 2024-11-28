package org.pessoal.lojinha_api.repository;

import org.pessoal.lojinha_api.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRespository extends CrudRepository<Categoria, Integer> {
}
