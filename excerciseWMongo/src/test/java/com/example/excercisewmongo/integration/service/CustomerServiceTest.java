package com.example.excercisewmongo.integration.service;

import com.example.excercisewmongo.BaseTests;
import com.example.excercisewmongo.model.Customer;
import com.example.excercisewmongo.repositories.CustomersRepository;
import com.example.excercisewmongo.service.CustomerService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceTest extends BaseTests {

    @Autowired
    private CustomersRepository customersRepository;

    @Autowired
    private CustomerService customerService;


    @BeforeEach
    public void beforeEach() {
        Customer c1 = new Customer();
        c1.setName("Oanh");
        c1.setUsername("oanh123");

        customersRepository.save(c1);

        Customer c2 = new Customer();
        c2.setName("Yen Oanh");
        c2.setUsername("yenoanh111");
        customersRepository.save(c2);

        Customer c3 = new Customer();
        c3.setName("Phu");
        c3.setUsername("phu567");
        customersRepository.save(c3);
    }

    @AfterEach
    public void afterEach() {
        customersRepository.deleteAll();
    }

    @Test
    public void testGetFindCustomerByName_Success() {
        List<Customer> customers = customerService.findCustomersByName("Oanh");
        Assertions.assertEquals(1, customers.size());
        Customer customer = customers.get(0);
        Assertions.assertEquals("oanh123", customer.getUsername());
    }
}
