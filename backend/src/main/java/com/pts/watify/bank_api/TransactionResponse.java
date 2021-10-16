package com.pts.watify.bank_api;

import lombok.Data;

import java.util.List;

@Data
public class TransactionResponse {
    List<Transaction> transactions;
}
