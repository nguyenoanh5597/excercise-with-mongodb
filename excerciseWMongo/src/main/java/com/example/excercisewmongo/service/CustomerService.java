package com.example.excercisewmongo.service;

import com.example.excercisewmongo.model.Customer;
import org.apache.catalina.User;

import java.util.List;

public interface CustomerService {
    List<Customer> findCustomersByName(String name);
    Customer updateNameByUser(String username, String name);
}
