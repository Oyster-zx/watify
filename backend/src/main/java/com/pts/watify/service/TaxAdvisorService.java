package com.pts.watify.service;

import com.pts.watify.model.Advisor;
import com.pts.watify.model.Invoice;
import com.pts.watify.model.User;
import com.pts.watify.model.vat_report.VatReportWithMetadata;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TaxAdvisorService {

    public void generateReport(){
        VatReportWithMetadata vatReport = new VatReportWithMetadata(LocalDate.now(), invoice(), user(), advisor());
    }

    private Invoice invoice(){
        return new Invoice();
    }

    private Advisor advisor(){
        return new Advisor();
    }

    private User user() {
        return new User();
    }
}
