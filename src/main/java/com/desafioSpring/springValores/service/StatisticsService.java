package com.desafioSpring.springValores.service;

import com.desafioSpring.springValores.dto.StatisticsDto;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StatisticsService {
    public StatisticsDto calculateValores(List<Double> valores) {
        Integer listInputSize = valores.size();
        StatisticsDto statistics = new StatisticsDto();
        statistics.setMedia(calcularMedia(valores, listInputSize));
        statistics.setDesvio_padrao(calcularDesfioPadrao(valores, listInputSize));
        statistics.setQtde(listInputSize);
        statistics.setMediano(calcularmediano(valores, listInputSize));
        statistics.setSoma(calcularSoma(valores));
        statistics.setValorMaximo(calcularValorMax(valores));
        statistics.setValorMininmo(calcularValorMin(valores));
        return statistics;
    }

    private double calcularValorMin(List<Double> valores) {
        if (valores == null || valores.size() == 0) {
            return Integer.MAX_VALUE;
        }
        return Collections.min(valores);
    }

    private double calcularValorMax(List<Double> valores) {
        if (valores == null || valores.size() == 0) {
            return Integer.MIN_VALUE;
        }
        return Collections.max(valores);
    }

    private double calcularSoma(List<Double> valores) {
        double soma = 0;
        for (int i = 0; i < valores.size(); i++) {
             soma += valores.get(i);
        }
        return soma;
    }

    private double calcularmediano(List<Double> valores, Integer listInputSize) {
        Collections.sort(valores);
        if (listInputSize % 2 == 0) {
            int middleIndex1 = listInputSize / 2 - 1;
            int middleIndex2 = listInputSize / 2;
            double valor1 = valores.get(middleIndex1);
            double valor2 = valores.get(middleIndex2);
            return (valor1 + valor2) / 2.0;
        } else {
            int middleIndex = listInputSize / 2;
            return valores.get(middleIndex);
        }
    }


    private double calcularDesfioPadrao(List<Double> valores, Integer listInputSize) {
        double media = calcularMedia(valores, listInputSize);
        double somaDiferencasQuadradas = 0.0;

        for (Double valor : valores) {
            somaDiferencasQuadradas += Math.pow(valor - media, 2);
        }

        double variancia = somaDiferencasQuadradas / listInputSize;
        return Math.sqrt(variancia);
    }


    private double calcularMedia(List<Double> valores, Integer listInputSize) {
        return valores.stream().mapToDouble(a -> a).average().orElse(0);
    }


}
