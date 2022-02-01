package com.brunoclaudinos.stockcontrol.domain.controller;

import com.brunoclaudinos.stockcontrol.domain.service.DefaultService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

public class DefaultController<E, ID extends Serializable, S extends DefaultService<E, ID, ?>> {

    private final S service;

    public DefaultController(S service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<E>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<E> findById(@PathVariable("id") ID id) {
        return ResponseEntity.ok(service.findById(id).get());
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") ID id) {
        service.deleteById(id);
    }

    @DeleteMapping
    public void deleteAllById(@PathVariable("ids") List<ID> ids) {
        service.deleteAllById(ids);
    }

    @PostMapping
    public ResponseEntity<E> save(@RequestBody E Produto) {
        return ResponseEntity.ok(service.save(Produto));
    }
}
