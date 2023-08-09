package com.desafioSpring.springValores.entity;

import lombok.Data;
import lombok.ToString;


import java.math.BigDecimal;
import java.util.List;

@Data
@ToString
public class Statistics {

    private List<Double> valores;

    private double media;

    private double desvio_padrao;

    private int qtde;

    private double mediano;

}
