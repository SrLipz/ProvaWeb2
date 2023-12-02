package org.senai.ecommerce.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "produto")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="codigo")
public class Produto {
    @Id
    private Long codigo;
    private String nome;
    private String descricao;
    private double preco;
    private int estoque;
}
