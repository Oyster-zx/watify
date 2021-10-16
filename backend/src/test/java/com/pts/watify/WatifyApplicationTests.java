package com.pts.watify;

import com.pts.watify.bank_api.CSASClient;
import com.pts.watify.bank_api.Transaction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WatifyApplicationTests {

    @Autowired
    CSASClient csasClient;

    @Test
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
