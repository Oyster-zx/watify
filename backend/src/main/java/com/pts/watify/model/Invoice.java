package com.pts.watify.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Invoice {
    String title;
    String dic;
    BigDecimal basePayment;
    BigDecimal vatPayment;
    int vatRate;
}
