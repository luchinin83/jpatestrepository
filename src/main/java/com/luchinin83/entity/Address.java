package com.luchinin83.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STREET")
    private String street;

    @Column(name = "POST_CODE", length = 10)
    private String postCode;

    public Address(){

    }


}
