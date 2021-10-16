package com.pts.watify.bank_api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "csas-payment-api", url = "https://webapi.developers.erstegroup.com/api/csas/public/sandbox/v1/payments/my")
public interface CSASPaymentClient {

    @RequestMapping(method = RequestMethod.POST, value = "/payments")
    PaymentResponse initPayment(
            @PathVariable("id") String id,
            @RequestHeader("web-api-key") String webApiKey,
            @RequestHeader("Authorization") String authToken
    );
}
