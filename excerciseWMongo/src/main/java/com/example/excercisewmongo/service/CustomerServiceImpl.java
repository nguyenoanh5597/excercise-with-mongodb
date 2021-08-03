package com.example.excercisewmongo.service;

import com.example.excercisewmongo.model.Customer;
import com.example.excercisewmongo.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class CustomerServiceImpl implements CustomerService {

    final CustomersRepository customersRepository;

    @Autowired
    public CustomerServiceImpl(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    @Override
    public List<Customer> findCustomersByName(String name) {
        try {
            List<Customer> customers = customersRepository.findAll();
            List<Customer> result = new ArrayList<>();

            for (Customer customer : customers) {
                if (Objects.nonNull(customer) && Objects.nonNull(customer.getName()) && customer.getName().equals(name)) {
                    result.add(customer);
                }
            }

            return result;
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public Customer updateNameByUser(String username, String name) {
        Customer c = customersRepository.findByUsername(username);
        c.setName(name);
        return customersRepository.save(c);
    }
}
