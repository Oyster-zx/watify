package com.pts.watify.bank_api.csas.payment;

import lombok.Data;

@Data
public class AuthorizationResponse {
    String validTo;
    String signingUrl;
    Poll poll;
    SignInfo signInfo;

    @Data
    private static class Poll {
        String id;
        Integer interval;
    }

    @Data
    private static class SignInfo {
        String state;
        String signId;
    }
}
