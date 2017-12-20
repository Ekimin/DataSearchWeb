package com.example.demo.service;

import com.example.demo.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomersByCardType(String cardType, int page, int size);

    int countByCardType(String cardType);


    List<Customer> getCustomersByNameCardTelCardType(String name, String cardNum, String tel, String cardType, int page, int size);

    int countByNameCardTelCardType(String name, String cardNum, String tel, String cardType);

    List<Customer> getCUstomersByName(String name, int page, int size);

    int countByName(String name);
}

