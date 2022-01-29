package com.brunoclaudinos.stockcontrol.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Unidade {

    @Id
    @GeneratedValue(generator = "seq_unidade")
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false, length = 3, unique = true)
    private String abreviatura;

}
