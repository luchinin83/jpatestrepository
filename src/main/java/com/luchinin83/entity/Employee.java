package com.luchinin83.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class Employee {

    private Long id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private Long addressId;

    public Employee(){

    }
}
