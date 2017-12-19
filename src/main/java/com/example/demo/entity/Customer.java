package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "p_Customer")
@Entity
public class Customer {

    @Id
    private String CstGUID;
    private String CstName;
    private String CardID;
    private String MobileTel;
    private String Email;
    private String Address;
    private String CardType;
    private String Gender;
}
