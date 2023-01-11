package com.company.limitsservice.controller;

import com.company.limitsservice.config.ApplicationConfig;
import com.company.limitsservice.model.Limits;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limits")
@RequiredArgsConstructor
public class LimitsController {

    private final ApplicationConfig config;

    @GetMapping
    public Limits getLimits(){
        return new Limits(config.getMinimum(),config.getMaximum());
    }
}
