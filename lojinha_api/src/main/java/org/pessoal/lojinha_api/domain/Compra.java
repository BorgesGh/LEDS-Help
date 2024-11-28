package org.pessoal.lojinha_api.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCompra;

    private Date dataCompra;

    @ManyToOne(fetch = FetchType.EAGER)
    private Cliente cliente;

    @OneToMany(mappedBy = "compra", fetch = FetchType.EAGER)
    List<ProdutosCompra> produtosCompras;
}
