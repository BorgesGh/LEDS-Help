package org.pessoal.lojinha_api.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProdutosCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProdutosCompra;

    private int quantidade;
    private double valor;

    @ManyToOne(fetch = FetchType.EAGER)
    private Produto produto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idCompra")
    private Compra compra;
}
