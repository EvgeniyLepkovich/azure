package com.yauheniy.lepkovich.azure.service.impl;

import com.yauheniy.lepkovich.azure.model.Customer;
import com.yauheniy.lepkovich.azure.repository.CustomerRepository;
import com.yauheniy.lepkovich.azure.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return StreamSupport
                .stream(customerRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
