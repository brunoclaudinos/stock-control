package com.brunoclaudinos.stockcontrol.domain.service;

import com.brunoclaudinos.stockcontrol.domain.model.Produto;
import com.brunoclaudinos.stockcontrol.domain.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto save(Produto Produto) {
        return repository.save(Produto);
    }

    public List<Produto> findAll() {
        return repository.findAll();
    }

    public Produto findById(Long id) {
        return repository.findById(id).get();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void deleteAllById(List<Long> ids) {
        repository.deleteAllById(ids);
    }

}
