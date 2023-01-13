package com.company.currencyconversionservice.client;

import com.company.currencyconversionservice.model.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-exchange",url = "http://localhost:8076/currency-exchange")
@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeProxy {

    @GetMapping("/from/{from}/to/{to}")
    CurrencyConversion retrieveExchangeValue(@PathVariable String from,
                                             @PathVariable String to);
}
