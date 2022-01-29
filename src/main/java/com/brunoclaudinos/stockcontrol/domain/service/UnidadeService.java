package com.brunoclaudinos.stockcontrol.domain.service;

import com.brunoclaudinos.stockcontrol.domain.model.Unidade;
import com.brunoclaudinos.stockcontrol.domain.repository.UnidadeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadeService {

    private final UnidadeRepository repository;

    public UnidadeService(UnidadeRepository repository) {
        this.repository = repository;
    }

    public Unidade save(Unidade unidade) {
        return repository.save(unidade);
    }

    public List<Unidade> findAll() {
        return repository.findAll();
    }

    public Unidade findById(Long id) {
        return repository.findById(id).get();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void deleteAllById(List<Long> ids) {
        repository.deleteAllById(ids);
    }

}
