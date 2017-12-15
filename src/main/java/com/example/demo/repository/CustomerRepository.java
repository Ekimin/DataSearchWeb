package com.example.demo.repository;

import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,String> {


    @Query(value = "select * from p_Customer where CardType = ?1 ORDER by CstGUID asc limit ?2,?3",nativeQuery = true)
    List<Customer> findByCardType(String cardType, int start, int size);

    @Query(value="select count(*) from  p_Customer where CardType = ?1",nativeQuery = true)
    int countByCardType(String cardType);

}

