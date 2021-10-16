package com.pts.watify;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.pts.watify.bank_api.csas.CSASPaymentClient;
import com.pts.watify.bank_api.csas.CSASTransactionClient;
import com.pts.watify.model.Advisor;
import com.pts.watify.model.Invoice;
import com.pts.watify.model.User;
import com.pts.watify.model.vat_report.VatReportWithMetadata;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootTest
@RequiredArgsConstructor
class WatifyApplicationTests {

    public final String webApiKey = "d5124a75-0ee6-451a-94be-d0dbca8feea1";
    public final String token = "ewogICJ0eXBlIjogInRva2VuIiwKICAibmFtZSI6ICI4MDAwLTAxLTAxLTAwLjAwLjAwLjAwMDAwMSIsCiAgInNlc3Npb25VVUlEIjogImI2Mzc1Mjk1LTMxNDItNGMzZC04NDNjLWNhOTM4MzdlOWFiMiIsCiAgInNjb3BlcyI6IFsKICAgICJzaWJsaW5ncy5hY2NvdW50cyIKICBdLAogICJjb25zZW50IjogWwogICAgewogICAgICAiaWQiOiAiMDAwMDAiLAogICAgICAiY29udGVudCI6ICJmdWxsIgogICAgfQogIF0sCiAgImxpbWl0cyI6IHsKICAgICJhY2Nlc3NTZWNvbmRzIjogMzAwLAogICAgInJlZnJlc2hTZWNvbmRzIjogNzc3NjAwMAogIH0sCiAgImFjY2Vzc1R5cGUiOiAibnVsbCIsCiAgImV4cGlyYXRpb24iOiAiMjAyMS0xMC0xNlQxNjo1ODoxMy45OTVaIgp9";

    @Autowired
    CSASTransactionClient csasTransactionClient;

    @Autowired
    CSASPaymentClient csasPaymentClient;

    @Test
    void testXml() throws IOException {
        ObjectMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        var invoice = new Invoice();
        invoice.setBasePayment(BigDecimal.valueOf(100000));
        invoice.setVatPayment(BigDecimal.valueOf(21000));

        var user = new User();
        var advisor = new Advisor();
        xmlMapper.writeValue(
                new File("/Users/alexanderpoddubny/report.xml"),
                new VatReportWithMetadata(LocalDate.now(), invoice, user, advisor)
        );
    }

    void transactions() {
        var transactionResponse = csasTransactionClient.getAllTransactions(
                "AA195E7DB499B4D9F48D46C208625FF53F2245F7",
                webApiKey,
                token
        );
        System.out.println(transactionResponse);

    }

    @Test
    void accounts() {
        var account = csasTransactionClient.getAllAccounts(
                webApiKey,
                token
        );
    }

    @Test
    void paymentInit() {
        var paymentResponse = csasPaymentClient.initPayment(
                webApiKey,
                token
        );

        var authorizationResponse = csasPaymentClient.authorizePayment(
                paymentResponse.getSignInfo().getSignId(),
                paymentResponse.getSignInfo().getHash(),
                webApiKey,
                token
        );

        System.out.println(authorizationResponse);
    }

}
