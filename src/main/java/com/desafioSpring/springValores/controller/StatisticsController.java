package com.desafioSpring.springValores.controller;

import com.desafioSpring.springValores.dto.StatisticsDto;
import com.desafioSpring.springValores.entity.Statistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.desafioSpring.springValores.service.StatisticsService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/stats")
public class StatisticsController {

    private final StatisticsService statisticsService;

    @Autowired
    public StatisticsController(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }


    @PostMapping("/calculate")
    public ResponseEntity<?> calculateStatistics(@RequestBody Statistics statistics) {
        StatisticsDto calculatedStats = statisticsService.calculateValores(statistics.getValores());
        return new ResponseEntity<>(calculatedStats, HttpStatus.OK);
    }


}
