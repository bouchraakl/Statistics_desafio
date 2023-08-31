package com.desafioSpring.springValores.dto;

import lombok.Data;

@Data
public class StatisticsDto {
    private double media;

    private double desvio_padrao;

    private int qtde;

    private double mediano;

    private double soma;

    private double valorMaximo;
    private double valorMininmo;
}
