package com.example.demo.service;

import com.example.demo.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomersByCardType(String cardType, int page,int size);
    int countByCardType(String cardType);
}

