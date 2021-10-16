package com.pts.watify.model.vat_report;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pts.watify.model.Invoice;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Income {
    //TODO add
    @JacksonXmlProperty(localName = "obrat23", isAttribute = true)
    private final BigDecimal revenue;

    @JacksonXmlProperty(localName = "dan23", isAttribute = true)
    private final BigDecimal vat;

    public Income(Invoice invoice){
        this.revenue = invoice.getBasePayment();
        this.vat = invoice.getVatPayment();
    }

}
