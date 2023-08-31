package com.desafioSpring.springValores;

import com.desafioSpring.springValores.entity.Statistics;
import com.desafioSpring.springValores.service.StatisticsService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class TesteSatisticsApp {
    Statistics statistics = new Statistics();
    StatisticsService statisticsService = new StatisticsService();
    List<Double> valoresTeste = new ArrayList<>();


    @Test
    public void testeCalcularMedia() {
        for (int i = 0; i < 20; i++) {
            valoresTeste.add((double) i);
        }
        Assertions.assertEquals(9.5,
                statisticsService.calculateValores(valoresTeste).getMedia());
    }

    @Test
    public void testeCalcularMediano() {
        for (int i = 0; i < 20; i++) {
            valoresTeste.add((double) i);
        }
        Assertions.assertEquals(9.5,
                statisticsService.calculateValores(valoresTeste).getMediano());
    }

    @Test
    public void testecalcularDesfioPadrao() {
        for (int i = 0; i < 20; i++) {
            valoresTeste.add((double) i);
        }
        Assertions.assertEquals(5.766281297335398,
                statisticsService.calculateValores(valoresTeste).getDesvio_padrao());
    }

    @Test
    public void testeSomaTodos(){
        for (int i = 0; i < 20; i++) {
            valoresTeste.add((double) i);
        }
        Assertions.assertEquals(190,
                statisticsService.calculateValores(valoresTeste).getSoma());
    }

    @Test
    public void testeValorMaximo(){
        for (int i = 0; i < 20; i++) {
            valoresTeste.add((double) i);
        }
        Assertions.assertEquals(19,
                statisticsService.calculateValores(valoresTeste).getValorMaximo());
    }

    @Test
    public void testeValorMinimo(){
        for (int i = 0; i < 20; i++) {
            valoresTeste.add((double) i);
        }
        Assertions.assertEquals(0,
                statisticsService.calculateValores(valoresTeste).getValorMininmo());
    }
}
