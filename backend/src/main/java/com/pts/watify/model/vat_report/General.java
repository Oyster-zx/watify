package com.pts.watify.model.vat_report;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

@AllArgsConstructor
@Getter
public class General {
    @JacksonXmlProperty(localName = "c_okec", isAttribute = true)
    private String businessActivity = "620000"; // ICT

    @JacksonXmlProperty(localName = "d_poddp", isAttribute = true)
    private final String sentDate;

    @JacksonXmlProperty(localName = "dapdph_forma", isAttribute = true)
    private String type = "B"; // {B: radne, O: opravne, D: dodatecne, E: dodatecne/opravne}

    @JacksonXmlProperty(localName = "dokument", isAttribute = true)
    private final String dokument = "DP3"; // const

    @JacksonXmlProperty(localName = "k_uladis", isAttribute = true)
    private String abbrev = "DPH"; // const

    @JacksonXmlProperty(localName = "mesic", isAttribute = true)
    private final Integer month;

    @JacksonXmlProperty(localName = "rok", isAttribute = true)
    private final int year;

    @JacksonXmlProperty(localName = "trans", isAttribute = true)
    private String trans = "A"; // {A: ano, vznikla danova povinnost, N: ne}

    @JacksonXmlProperty(localName = "typ_platce", isAttribute = true)
    private String payerType = "P"; // {P: platce dane, I: identifikovana osoba, S: skupina}

    @JacksonXmlProperty(localName = "zdobd_do", isAttribute = true)
    private final String dateEnd;

    @JacksonXmlProperty(localName = "zdobd_od", isAttribute = true)
    private final String dateStart;

    public General(YearMonth yearMonth, LocalDate sentDate){
        this.year = yearMonth.getYear();
        this.month = yearMonth.getMonthValue();
        this.dateStart = yearMonth.atDay(1).format(DateTimeFormatter.ofPattern("dd.MM.uuuu"));
        this.dateEnd = yearMonth.atEndOfMonth().format(DateTimeFormatter.ofPattern("dd.MM.uuuu"));
        this.sentDate = sentDate.format(DateTimeFormatter.ofPattern("dd.MM.uuuu"));

    }
}
