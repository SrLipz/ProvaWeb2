package org.senai.ecommerce.repositories;

import org.senai.ecommerce.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
