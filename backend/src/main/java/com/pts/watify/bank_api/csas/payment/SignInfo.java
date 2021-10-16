package com.pts.watify.bank_api.csas.payment;

import lombok.Data;

@Data
public class SignInfo {
        String signId;
        String hash;
        String state;
}
