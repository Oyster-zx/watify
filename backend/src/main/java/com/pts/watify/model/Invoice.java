package com.pts.watify.model;

import com.pts.watify.model.vat_report.VatReportWithMetadata;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class Invoice {
    @Id
    Long id;
    @Column
    String title;
    @Column
    String dic;
    @Column
    BigDecimal basePayment;
    @Column
    BigDecimal vatPayment;
    @Column
    int vatRate;
}
