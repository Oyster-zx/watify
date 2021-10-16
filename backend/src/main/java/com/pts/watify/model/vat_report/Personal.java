package com.pts.watify.model.vat_report;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Personal {

    @JacksonXmlProperty(localName = "c_pop", isAttribute = true)
    private final Integer home = 999;

    @JacksonXmlProperty(localName = "c_telef", isAttribute = true)
    private final String phoneNumber = "776612345";

    @JacksonXmlProperty(localName = "c_ufo", isAttribute = true)
    private final Integer c_ufo = 451; // financni urad ciselnik

    @JacksonXmlProperty(localName = "c_pracufo", isAttribute = true)
    private final Integer c_pracufo = 2010; // uzemni pracoviste

    @JacksonXmlProperty(localName = "dic", isAttribute = true)
    private final String dic = "9001309999";

    @JacksonXmlProperty(localName = "email", isAttribute = true)
    private final String email = "test_email@gmail.com";

    @JacksonXmlProperty(localName = "jmeno", isAttribute = true)
    private final String name = "Peter";

    @JacksonXmlProperty(localName = "naz_ovce", isAttribute = true)
    private final String district = "Praha 1";

    @JacksonXmlProperty(localName = "opr_jmeno", isAttribute = true)
    private String advisorName;

    @JacksonXmlProperty(localName = "opr_postaveni", isAttribute = true)
    private final String advisorRelation = "zamestnanec"; //TODO

    @JacksonXmlProperty(localName = "opr_prijmeni", isAttribute = true)
    private String advisorSurname;

    @JacksonXmlProperty(localName = "prijmeni", isAttribute = true)
    private String surname;

    @JacksonXmlProperty(localName = "psc", isAttribute = true)
    private String zipCode;

    @JacksonXmlProperty(localName = "stat", isAttribute = true)
    private String country;

    @JacksonXmlProperty(localName = "typ_ds", isAttribute = true)
    private String typ_ds;

    @JacksonXmlProperty(localName = "ulice", isAttribute = true)
    private String street;

    @JacksonXmlProperty(localName = "zast_ic", isAttribute = true)
    private String zast_ic;

    @JacksonXmlProperty(localName = "zast_kod", isAttribute = true)
    private String zast_kod;

    @JacksonXmlProperty(localName = "zast_nazev", isAttribute = true)
    private String advisorCompanyName;

    @JacksonXmlProperty(localName = "zast_typ", isAttribute = true)
    private final String zast_typ = "P";

}
