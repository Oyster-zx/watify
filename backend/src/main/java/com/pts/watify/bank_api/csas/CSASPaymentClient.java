package com.pts.watify.bank_api.csas;

import com.pts.watify.bank_api.csas.payment.AuthorizationResponse;
import com.pts.watify.bank_api.csas.payment.PaymentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "csas-payment-api", url = "https://webapi.developers.erstegroup.com/api/csas/public/sandbox/v1/payments/my")
public interface CSASPaymentClient {

    @RequestMapping(method = RequestMethod.POST, value = "/payments")
    PaymentResponse initPayment(
            @RequestHeader("web-api-key") String webApiKey,
            @RequestHeader("Authorization") String authToken
    );

    @RequestMapping(method = RequestMethod.GET, value = "/payments/federate/sign/{signId}/hash/{hash}")
    AuthorizationResponse authorizePayment(
            @PathVariable String signId,
            @PathVariable String hash,
            @RequestHeader("web-api-key") String webApiKey,
            @RequestHeader("Authorization") String authToken
    );
}
