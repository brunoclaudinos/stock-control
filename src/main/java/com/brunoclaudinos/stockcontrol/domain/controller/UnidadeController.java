package com.brunoclaudinos.stockcontrol.domain.controller;

import com.brunoclaudinos.stockcontrol.domain.model.Unidade;
import com.brunoclaudinos.stockcontrol.domain.service.UnidadeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/unidade")
public class UnidadeController extends DefaultController<Unidade, Long, UnidadeService> {

    public UnidadeController(UnidadeService service) {
        super(service);
    }
}
