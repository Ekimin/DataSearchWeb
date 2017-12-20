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

    @Override
    public List<Customer> getCustomersByNameCardTelCardType(String name, String cardNum, String tel, String cardType, int page, int size) {
        return customerRepository.findByNameCardTelCardType(name,cardNum,tel,cardType,page,size);
    }

    @Override
    public int countByNameCardTelCardType(String name, String cardNum, String tel, String cardType) {
        return customerRepository.countByNameCardTelCardType(name, cardNum, tel, cardType);
    }

    @Override
    public List<Customer> getCUstomersByName(String name, int page, int size) {
        return customerRepository.findByName(name, page, size);
    }

    @Override
    public int countByName(String name) {
        return customerRepository.countByName(name);
    }
}
