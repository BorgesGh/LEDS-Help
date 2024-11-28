package org.pessoal.lojinha_api.controller;


import org.pessoal.lojinha_api.domain.Categoria;
import org.pessoal.lojinha_api.exceptions.ElementNotFindException;
import org.pessoal.lojinha_api.service.CategoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriaController {

    private CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping("api/Categoria/getTodos")
    public ResponseEntity<List<Categoria>> getAll() {
        try{
            return ResponseEntity.ok().body(categoriaService.getCategorias());
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("api/Categoria/getUmaCategoria/{id}")
    public ResponseEntity<?> getOne(@PathVariable Integer id) {
        try {
            Categoria categoria = categoriaService.getCategoria(id);
            return ResponseEntity.ok().body(categoria);

        } catch (ElementNotFindException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @PostMapping("api/Categoria/adicionar")
    public ResponseEntity<Categoria> add(@RequestBody Categoria categoria) {
        return ResponseEntity.ok().body(categoriaService.addCategoria(categoria));
    }

    @PutMapping("api/Categoria/atualizar")
    public ResponseEntity<Categoria> update(@RequestBody Categoria categoria) {
        return ResponseEntity.ok().body(categoriaService.update(categoria));
    }

    @DeleteMapping("api/Categoria/deletar")
    public ResponseEntity<String> delete(@RequestBody Categoria categoria) {
        try {
            categoriaService.delete(categoria);
            return ResponseEntity.ok().body("Categoria deletada com sucesso!");
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
