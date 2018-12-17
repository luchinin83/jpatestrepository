package com.luchinin83.dao;

import com.luchinin83.entity.Address;

import java.util.List;

public interface AddressDAO {

    void add(Address address);

    List<Address> getAll();

    Address getById(Long id);

    void update(Address address);

    void remove(Address address);
}
