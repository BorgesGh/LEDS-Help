package org.pessoal.lojinha_api.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduto;

    private String nome;
    private double valor;
    private Date dataValidade;

    @ManyToOne(fetch = FetchType.EAGER)
    private Categoria categoria;
}
