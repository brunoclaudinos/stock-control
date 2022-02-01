package com.brunoclaudinos.stockcontrol.domain.service;

import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class DefaultService<E, ID extends Serializable, R extends JpaRepository<E, ID>> {

    @Getter
    private final R repository;

    public DefaultService(R repository) {
        this.repository = repository;
    }

    public E save(E entity) {
        return repository.save(entity);
    }

    public List<E> findAll() {
        return repository.findAll();
    }

    public Optional<E> findById(ID id) {
        return repository.findById(id);
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    public void deleteAllById(List<ID> ids) {
        repository.deleteAllById(ids);
    }

}
