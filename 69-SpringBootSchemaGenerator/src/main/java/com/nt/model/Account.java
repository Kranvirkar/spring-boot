package com.nt.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "accounts")
public class Account {
    
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(name = "email_address")
    private String emailAddress;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<AccountSetting> accountSettings = new ArrayList<>();

    // getters and setters
}