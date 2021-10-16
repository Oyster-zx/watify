package com.pts.watify.bank_api;

import feign.Param;
import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

public interface CSASClient {
    @RequestLine("GET https://webapi.developers.erstegroup.com/api/csas/public/sandbox/v2/accounts/{id}/transactions")
    List<Transaction> getAllTransactions(
            @Param("id") String id,
            @RequestParam(value = "fromDate") LocalDate fromDate,
            @RequestParam(value = "toDate") LocalDate toDate,
            @RequestParam(value = "size") int size,
            @RequestParam(value = "page") int page,
            @RequestParam(value = "sort") String sort,
            @RequestParam(value = "order") String order
    );
}
