package com.brunoclaudinos.stockcontrol.domain.service;

import com.brunoclaudinos.stockcontrol.domain.model.Unidade;
import com.brunoclaudinos.stockcontrol.domain.repository.UnidadeRepository;
import org.springframework.stereotype.Service;

@Service
public class UnidadeService extends DefaultService<Unidade, Long, UnidadeRepository> {

    public UnidadeService(UnidadeRepository repository) {
        super(repository);
    }
}
