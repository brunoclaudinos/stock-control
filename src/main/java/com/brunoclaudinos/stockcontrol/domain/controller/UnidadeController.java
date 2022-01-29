package com.brunoclaudinos.stockcontrol.domain.controller;

import com.brunoclaudinos.stockcontrol.domain.model.Unidade;
import com.brunoclaudinos.stockcontrol.domain.service.UnidadeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/unidade")
public class UnidadeController {

    private final UnidadeService service;

    public UnidadeController(UnidadeService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Unidade>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Unidade> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    }

    @DeleteMapping
    public void deleteAllById(@PathVariable("ids") List<Long> ids) {
        service.deleteAllById(ids);
    }

    @PostMapping
    public ResponseEntity<Unidade> save(@RequestBody Unidade unidade) {
        return ResponseEntity.ok(service.save(unidade));
    }

}
