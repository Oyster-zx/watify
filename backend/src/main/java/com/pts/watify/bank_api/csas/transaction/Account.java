package com.pts.watify.bank_api.csas.transaction;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Account {
    /*
      "id": "D2C8C1DCC51A3738538A40A4863CA288E0225E52",
      "identification": {
        "iban": "CZ0708000000001019382023",
        "other": "1019382023/0800"
      },
      "currency": "CZK",
      "servicer": {
        "bankCode": "0800",
        "countryCode": "CZ",
        "bic": "GIBACZPX"
      },
      "nameI18N": "Muj hlavni osobni ucet",
      "productI18N": "Osobní účet ČS",
      "ownersNames": [
        "Jiří Spokojený"
      ]
     */
    String id;
    Identification identification;
    String current;
    Servicer servicer;
    String nameI18N;
    String productI18N;
    List<String> ownersNames;

    private static class Identification {
        String iban;
        String other;
    }

    private static class Servicer {
        String bankCode;
        String countryCode;
        String bic;
    }
}
