package com.yauheniy.lepkovich.azure.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Customer", schema = "SalesLT")
public class Customer {

    @Id
    @GeneratedValue
    private long customerId;

    private boolean nameStyle;
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String companyName;
    private String salesPerson;
    private String emailAddress;
    private String phone;
    private String passwordHash;
    private String passwordSalt;
}
