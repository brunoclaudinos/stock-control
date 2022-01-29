package com.brunoclaudinos.stockcontrol.domain.controller;

import com.brunoclaudinos.stockcontrol.domain.model.Produto;
import com.brunoclaudinos.stockcontrol.domain.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/produto")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Produto> findById(@PathVariable("id") Long id) {
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
    public ResponseEntity<Produto> save(@RequestBody Produto Produto) {
        return ResponseEntity.ok(service.save(Produto));
    }

}
