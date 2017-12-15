package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> getCustomersByCardType(String cardType, int page, int size) {
        return customerRepository.findByCardType(cardType,page,size);
    }

    @Override
    public int countByCardType(String cardType) {
        return customerRepository.countByCardType(cardType);
    }
}
