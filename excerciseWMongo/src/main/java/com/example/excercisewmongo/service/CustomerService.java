package com.example.excercisewmongo.service;

import com.example.excercisewmongo.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findCustomersByName(String name);
    Customer updateNameByUser(String username, String name);
}
