package com.pts.watify.model.vat_report;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.pts.watify.model.Invoice;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

@Getter
@JacksonXmlRootElement(localName = "Pisemnost")
public class VatReportWithMetadata {
    @JacksonXmlProperty(localName = "nazevSW", isAttribute = true)
    private final String title = "EPO MF ČR";

    @JacksonXmlProperty(localName = "verzeSW", isAttribute = true)
    private final String softwareVersion = "41.37.1";

    @JacksonXmlProperty(localName = "DPHDP3")
    private final VatReport report;

    public VatReportWithMetadata(LocalDate sentDate, Invoice invoice) {
        var reportMonth = Month.of(sentDate.getMonthValue() - 1); // TODO set not only for previous month
        this.report = new VatReport(
                new General(YearMonth.of(sentDate.getYear(), reportMonth), sentDate),
                new Income(invoice),
                new TaxResult(invoice)
        );
    }

    @AllArgsConstructor
    class VatReport {
        @JacksonXmlProperty(isAttribute = true)
        private final String version = "01.02";

        @JacksonXmlProperty(localName = "VetaD")
        private final General generalInfo;
//
//        @JacksonXmlProperty(localName = "VetaP")
//        private Personal personalInfo;

        @JacksonXmlProperty(localName = "Veta1")
        private final Income incomeInfo;

        @JacksonXmlProperty(localName = "Veta6")
        private final TaxResult taxResult;

    }

}
