package com.pts.watify.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Transaction {
    @Id
    @GeneratedValue
    Long id;
    @Column
    BigDecimal amount;
}
