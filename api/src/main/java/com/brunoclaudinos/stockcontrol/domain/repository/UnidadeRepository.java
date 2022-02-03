package com.brunoclaudinos.stockcontrol.domain.repository;

import com.brunoclaudinos.stockcontrol.domain.model.Unidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnidadeRepository extends JpaRepository<Unidade, Long> {
}
