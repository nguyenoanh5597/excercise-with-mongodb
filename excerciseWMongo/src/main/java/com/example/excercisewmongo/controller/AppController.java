package com.example.excercisewmongo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String index() {
        return "HALO!";
    }

    @PostMapping("/api/sayHi")
    public String sayHi(@RequestBody String body) {
        return body;
    }

//    @GetMapping(value = "/customer")
//    public List<Customer> getAllCustomers() {
//        return customersRepository.findAll();
//    }

}
