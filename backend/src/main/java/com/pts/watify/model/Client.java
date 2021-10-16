package com.pts.watify.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue
    Long id;
    @Column
    String name;
    @Column
    String ic;
    @Column
    String dic;
    @Column
    String bankAccount;
    @Column
    BigDecimal mdRate;
}
