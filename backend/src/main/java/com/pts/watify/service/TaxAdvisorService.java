package com.pts.watify.service;

import com.pts.watify.model.Invoice;
import com.pts.watify.model.vat_report.VatReportWithMetadata;
import org.springframework.stereotype.Service;

@Service
public class TaxAdvisorService {

    void generateReport(){
        var invoice = invoice();
        VatReportWithMetadata vatReport = new VatReportWithMetadata(invoice);
    }

    Invoice invoice(){
        return new Invoice();
    }
}
