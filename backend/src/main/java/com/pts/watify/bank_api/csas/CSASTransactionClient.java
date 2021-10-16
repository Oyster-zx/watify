package com.pts.watify.bank_api.csas;

import com.pts.watify.bank_api.csas.transaction.AccountResponse;
import com.pts.watify.bank_api.csas.transaction.TransactionResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "csas-transaction-api", url = "https://webapi.developers.erstegroup.com/api/csas/public/sandbox/v2/accounts/my")
public interface CSASTransactionClient {

    @RequestMapping(method = RequestMethod.GET, value = "/accounts/{id}/transactions")
    TransactionResponse getAllTransactions(
            @PathVariable("id") String id,
            @RequestHeader("web-api-key") String webApiKey,
            @RequestHeader("Authorization") String authToken
//            @RequestParam(value = "fromDate") LocalDate fromDate,
//            @RequestParam(value = "toDate") LocalDate toDate,
//            @RequestParam(value = "size") int size,
//            @RequestParam(value = "page") int page,
//            @RequestParam(value = "sort") String sort,
//            @RequestParam(value = "order") String order
    );

    @RequestMapping(method = RequestMethod.GET, value = "/accounts")
    AccountResponse getAllAccounts(
            @RequestHeader("web-api-key") String webApiKey,
            @RequestHeader("Authorization") String authToken
    );


}
