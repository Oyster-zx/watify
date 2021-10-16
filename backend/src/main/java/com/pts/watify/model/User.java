package com.pts.watify.model;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "watify_user")
@Builder
@NoArgsConstructor
public class User {
    @Id
    Long id;
    @Column
    String name;
    @Column
    String ico;
    @Column
    String dic;
    @Column
    String bankAccount;
}
