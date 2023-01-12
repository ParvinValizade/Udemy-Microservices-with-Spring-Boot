package com.company.currencyconversionservice.model;

import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CurrencyConversion {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;
    private String environment;
}