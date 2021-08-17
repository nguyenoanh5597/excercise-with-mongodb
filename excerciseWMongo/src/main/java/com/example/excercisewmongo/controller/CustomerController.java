package com.example.excercisewmongo.controller;

import com.example.excercisewmongo.entity.Customer;
import com.example.excercisewmongo.repositories.CustomersRepository;
import com.example.excercisewmongo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomersRepository customersRepository;

    @Autowired
    private CustomerService customerService;

    @GetMapping("")
    public List<Customer> getAllCustomers() {
        return customersRepository.findAll();
    }

    @GetMapping(value = "/{customerId}")
    public Customer getCustomerById(@PathVariable("customerId") String id) {
        return customersRepository.findCustomerById(id);
    }

    @PostMapping("/createCustomer")
    public Customer sayHi(@RequestBody Customer customer) {
        customersRepository.save(customer);
        return customer;
    }

    @PatchMapping("/updateCustomer/{customerId}")
    public Customer updateCustomer(@PathVariable("customerId") String id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping("/deleteCustomer/{customerId}")
    public String deleteCustomer(@PathVariable("customerId") String id) {
        return customerService.deleteCustomer(id);
    }

    @DeleteMapping("/deleteAllCustomers")
    public String deleteAllCustomers() {
        customersRepository.deleteAll();
        return "Delete all success";
    }

}
