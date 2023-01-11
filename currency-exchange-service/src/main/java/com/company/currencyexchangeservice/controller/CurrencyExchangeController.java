package com.company.currencyexchangeservice.controller;

import com.company.currencyexchangeservice.model.CurrencyExchange;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/currency-exchange")
@RequiredArgsConstructor
public class CurrencyExchangeController {

    private final Environment environment;

    @GetMapping("/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable String from,
                                                  @PathVariable String to) {
        String port = environment.getProperty("local.server.port");
        System.out.println("port::"+port);

        return CurrencyExchange.builder().id(1L).
                from(from).
                to(to).
                conversionMultiple(BigDecimal.valueOf(100))
                .environment(port)
                .build();
    }

}
