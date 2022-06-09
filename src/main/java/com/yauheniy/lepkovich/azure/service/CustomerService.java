package com.yauheniy.lepkovich.azure.service;

import com.yauheniy.lepkovich.azure.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
}
