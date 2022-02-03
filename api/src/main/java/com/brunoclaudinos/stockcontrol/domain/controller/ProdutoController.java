package com.brunoclaudinos.stockcontrol.domain.controller;

import com.brunoclaudinos.stockcontrol.domain.model.Produto;
import com.brunoclaudinos.stockcontrol.domain.service.ProdutoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/produto")
public class ProdutoController extends DefaultController<Produto, Long, ProdutoService> {

    public ProdutoController(ProdutoService service) {
        super(service);
    }
}
