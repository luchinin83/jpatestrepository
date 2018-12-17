package com.luchinin83.entity;

import lombok.Data;

@Data
public class Address {

    private Long id;
    private String country;
    private String city;
    private String street;
    private String postCode;

    public Address(){

    }


}
