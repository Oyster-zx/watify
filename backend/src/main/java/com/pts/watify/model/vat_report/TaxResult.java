package com.pts.watify.model.vat_report;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pts.watify.model.Invoice;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class TaxResult {

    @JacksonXmlProperty(localName = "dan_zocelk", isAttribute = true)
    final BigDecimal vatFromIncome;

    @JacksonXmlProperty(localName = "dano", isAttribute = true)
    final BigDecimal vatFromAdditionalReport = BigDecimal.ZERO;

    @JacksonXmlProperty(localName = "dano_da", isAttribute = true)
    final BigDecimal finalVat;

    @JacksonXmlProperty(localName = "dano_no", isAttribute = true)
    final BigDecimal vatToBeReturned = BigDecimal.ZERO;

    public TaxResult(Invoice invoice){
        this.vatFromIncome = invoice.getVatPayment();
        this.finalVat = invoice.getVatPayment();
    }



}
