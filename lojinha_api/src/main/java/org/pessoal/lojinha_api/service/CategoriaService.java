package org.pessoal.lojinha_api.service;

import org.pessoal.lojinha_api.domain.Categoria;
import org.pessoal.lojinha_api.exceptions.ElementNotFindException;
import org.pessoal.lojinha_api.repository.CategoriaRespository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private CategoriaRespository categoriaRespository;

    public CategoriaService(CategoriaRespository categoriaRespository) {
        this.categoriaRespository = categoriaRespository;
    }

    public List<Categoria> getCategorias(){
        return (List<Categoria>) categoriaRespository.findAll();
    }

    public Categoria getCategoria(Integer id) throws ElementNotFindException {
        return categoriaRespository.findById(id)
                .orElseThrow(() -> new ElementNotFindException("Categoria com ID " + id + " não encontrada."));
    }

    public Categoria addCategoria(Categoria categoria){
        return categoriaRespository.save(categoria);
    }

    public Categoria update(Categoria categoria){
        Categoria catNova = categoriaRespository.findById(categoria.getIdCategoria()).get();
        catNova.setNome(categoria.getNome());
        categoriaRespository.save(catNova);
        return categoria;
    }

    public void delete(Categoria categoria){
        categoriaRespository.delete(categoria);
    }
}
