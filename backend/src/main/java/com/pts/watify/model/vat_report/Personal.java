package com.pts.watify.model.vat_report;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pts.watify.model.Advisor;
import com.pts.watify.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Personal {

    @JacksonXmlProperty(localName = "c_pop", isAttribute = true)
    private final Integer home;

    @JacksonXmlProperty(localName = "c_telef", isAttribute = true)
    private final String phoneNumber;

    @JacksonXmlProperty(localName = "c_ufo", isAttribute = true)
    private final Integer taxOfficeNum; // financni urad ciselnik

    @JacksonXmlProperty(localName = "c_pracufo", isAttribute = true)
    private final Integer taxOffice; // uzemni pracoviste

    @JacksonXmlProperty(localName = "dic", isAttribute = true)
    private final String dic;

    @JacksonXmlProperty(localName = "email", isAttribute = true)
    private final String email;

    @JacksonXmlProperty(localName = "jmeno", isAttribute = true)
    private final String name;

    @JacksonXmlProperty(localName = "naz_ovce", isAttribute = true)
    private final String district;

    @JacksonXmlProperty(localName = "opr_jmeno", isAttribute = true)
    private final String advisorName;

    @JacksonXmlProperty(localName = "opr_postaveni", isAttribute = true)
    private final String advisorRelation = "zamestnanec"; //TODO

    @JacksonXmlProperty(localName = "opr_prijmeni", isAttribute = true)
    private final String advisorSurname;

    @JacksonXmlProperty(localName = "prijmeni", isAttribute = true)
    private final String surname;

    @JacksonXmlProperty(localName = "psc", isAttribute = true)
    private final String zipCode;

    @JacksonXmlProperty(localName = "stat", isAttribute = true)
    private final String country; // TODO const

    @JacksonXmlProperty(localName = "typ_ds", isAttribute = true)
    private final String typ_ds = "F"; // {F: fyzicka osoba, P: pravnicka osoba}

    @JacksonXmlProperty(localName = "ulice", isAttribute = true)
    private final String street;

    @JacksonXmlProperty(localName = "zast_ic", isAttribute = true)
    private final String advisorIndividualNumber;

    @JacksonXmlProperty(localName = "zast_kod", isAttribute = true)
    private final String advisorType = "2"; // TODO temporary (ustanoveny zastupce)

    @JacksonXmlProperty(localName = "zast_nazev", isAttribute = true)
    private final String advisorCompanyName;

    @JacksonXmlProperty(localName = "zast_typ", isAttribute = true)
    private final String zast_typ = "P";

    public Personal(User user, Advisor advisor){
        this.advisorCompanyName = advisor.getCompanyName();
        this.advisorIndividualNumber = advisor.getIndividualNumber();
        this.advisorName = advisor.getName();
        this.advisorSurname = advisor.getSurname();

        this.taxOfficeNum = 451;
        this.taxOffice = 2010;
        this.email = "test@gmail.com";
        this.name = user.getName();
        this.dic = user.getDic();
        this.surname = "Parker";
        this.country = "ČESKÁ REPUBLIKA";
        this.zipCode = "10100";
        this.street = "Legerova 1";
        this.district = "Praha 2";
        this.home = 999;
        this.phoneNumber = "776612345";
    }

}
