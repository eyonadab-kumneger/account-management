package com.microservices.accounts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account_tbl")
public class Account {

    @Id
    private Long id;
}
