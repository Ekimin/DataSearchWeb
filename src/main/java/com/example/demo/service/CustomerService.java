package com.example.demo.service;

import com.example.demo.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {

    Page<Customer> getCustomersByCardType(String cardType,Pageable pageable);
}

