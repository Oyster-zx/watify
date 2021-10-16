package com.pts.watify;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.pts.watify.bank_api.CSASClient;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.pts.watify.model.Invoice;
import com.pts.watify.model.vat_report.VatReportWithMetadata;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

class WatifyApplicationTests {

    @Autowired
    CSASClient csasClient;

    @Test
    void testXml() throws IOException {
        ObjectMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        var invoice = new Invoice();
        invoice.setBasePayment(BigDecimal.valueOf(100000));
        invoice.setVatPayment(BigDecimal.valueOf(21000));
        xmlMapper.writeValue(
                new File("/Users/alexanderpoddubny/report.xml"),
                new VatReportWithMetadata(LocalDate.now(), invoice)
        );
    }

    void transactions() {
        var transactionResponse = csasClient.getAllTransactions(
                "AA195E7DB499B4D9F48D46C208625FF53F2245F7",
                "d5124a75-0ee6-451a-94be-d0dbca8feea1",
                "ewogICJ0eXBlIjogInRva2VuIiwKICAibmFtZSI6ICI4MDAwLTAxLTAxLTAwLjAwLjAwLjAwMDAwMSIsCiAgInNlc3Npb25VVUlEIjogIjIxN2M4Yjk1LWE0MTMtNDkzZS04NzdjLWMyNjhiNjhhNGM0MCIsCiAgInNjb3BlcyI6IFsKICAgICJzaWJsaW5ncy5hY2NvdW50cyIKICBdLAogICJjb25zZW50IjogWwogICAgewogICAgICAiaWQiOiAiMDAwMDAiLAogICAgICAiY29udGVudCI6ICJmdWxsIgogICAgfQogIF0sCiAgImxpbWl0cyI6IHsKICAgICJhY2Nlc3NTZWNvbmRzIjogMzAwLAogICAgInJlZnJlc2hTZWNvbmRzIjogNzc3NjAwMAogIH0sCiAgImFjY2Vzc1R5cGUiOiAibnVsbCIsCiAgImV4cGlyYXRpb24iOiAiMjAyMS0xMC0xNlQxNDoyMDo1NC4xMDVaIgp9"
        );
        System.out.println(transactionResponse);

    }

    @Test
    void accounts() {
        var account = csasClient.getAllAccounts(
                "d5124a75-0ee6-451a-94be-d0dbca8feea1",
                "ewogICJ0eXBlIjogInRva2VuIiwKICAibmFtZSI6ICI4MDAwLTAxLTAxLTAwLjAwLjAwLjAwMDAwMSIsCiAgInNlc3Npb25VVUlEIjogIjg5MDUyOGQxLTIwOTktNGNhYi1iNTBhLWM1NjUzZjg3MjI4MCIsCiAgInNjb3BlcyI6IFsKICAgICJzaWJsaW5ncy5hY2NvdW50cyIKICBdLAogICJjb25zZW50IjogWwogICAgewogICAgICAiaWQiOiAiMDAwMDAiLAogICAgICAiY29udGVudCI6ICJmdWxsIgogICAgfQogIF0sCiAgImxpbWl0cyI6IHsKICAgICJhY2Nlc3NTZWNvbmRzIjogMzAwLAogICAgInJlZnJlc2hTZWNvbmRzIjogNzc3NjAwMAogIH0sCiAgImFjY2Vzc1R5cGUiOiAibnVsbCIsCiAgImV4cGlyYXRpb24iOiAiMjAyMS0xMC0xNlQxMzo0NDoyNC45NzBaIgp9"
        );
    }

}
