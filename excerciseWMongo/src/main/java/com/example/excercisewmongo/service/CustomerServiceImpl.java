package com.example.excercisewmongo.service;

import com.example.excercisewmongo.entity.Customer;
import com.example.excercisewmongo.repositories.CustomersRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

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
        customersRepository.save(c);
        return c;
    }

    @Override
    public Customer updateCustomer(String id, Customer customer) {
        Customer c = customersRepository.findCustomerById(id);
        c.setName(customer.getName());
        c.setUsername(customer.getUsername());
        customersRepository.save(c);
        return c;
    }

    @Override
    public String deleteCustomer(String id) {
        Customer c = customersRepository.findCustomerById(id);
        customersRepository.delete(c);
        return "delete success";
    }

    @Override
    public String createJWT(String username) {
        Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        Map<String, Object> claims = new HashMap<String, Object>();
        claims.put("username", username);

        String token = Jwts.builder()
                .setHeaderParam("alg", "RS256")
                .setHeaderParam("typ", "JWT")
                .setClaims(claims)
                .signWith(key)
                .compact();
        return token;
    }



}
