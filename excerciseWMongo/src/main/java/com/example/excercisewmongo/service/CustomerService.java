package com.example.excercisewmongo.service;

import com.example.excercisewmongo.entity.Customer;

import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.util.List;

public interface CustomerService {
    List<Customer> findCustomersByName(String name);
    Customer updateNameByUser(String username, String name);
    Customer updateCustomer(String id, Customer customer);
    String deleteCustomer(String id);
    String createJWT(String username);
}
