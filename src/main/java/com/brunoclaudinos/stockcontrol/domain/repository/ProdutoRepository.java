package com.brunoclaudinos.stockcontrol.domain.repository;

import com.brunoclaudinos.stockcontrol.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
