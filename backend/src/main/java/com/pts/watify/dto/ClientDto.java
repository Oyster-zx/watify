package com.pts.watify.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ClientDto {
    String name;
    String ic;
    String dic;
    String bankAccount;
    BigDecimal mdRate;
}
