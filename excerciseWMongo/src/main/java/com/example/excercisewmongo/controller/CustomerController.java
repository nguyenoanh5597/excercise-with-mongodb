package com.example.excercisewmongo.controller;

import com.example.excercisewmongo.entity.Customer;
import com.example.excercisewmongo.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomersRepository customersRepository;

    @GetMapping("")
    public List<Customer> getAllCustomers() {
        System.out.println(customersRepository.findAll());
        return customersRepository.findAll();
    }

    @GetMapping(value = "/{customerId}")
    public Customer getCustomerById(@PathVariable("customerId") String customerId) {
        return customersRepository.findCustomerById(customerId);
    }

}
