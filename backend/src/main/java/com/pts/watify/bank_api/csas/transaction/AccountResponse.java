package com.pts.watify.bank_api.csas.transaction;

import lombok.Data;

import java.util.List;

@Data
public class AccountResponse {
    List<Account> accounts;
}
