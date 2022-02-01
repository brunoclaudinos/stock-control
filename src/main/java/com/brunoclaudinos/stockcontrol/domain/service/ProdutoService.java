package com.brunoclaudinos.stockcontrol.domain.service;

import com.brunoclaudinos.stockcontrol.domain.model.Produto;
import com.brunoclaudinos.stockcontrol.domain.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService extends DefaultService<Produto, Long, ProdutoRepository> {

    public ProdutoService(ProdutoRepository repository) {
        super(repository);
    }
}
