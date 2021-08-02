package com.example.excercisewmongo;

import com.example.excercisewmongo.model.Customer;
import com.example.excercisewmongo.model.Person;
import com.example.excercisewmongo.repositories.CustomersRepository;
import com.example.excercisewmongo.repositories.PersonRepository;
import com.mongodb.client.MongoCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@SpringBootApplication
public class ExcerciseWMongoApplication {

//    @Autowired
//    private PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(ExcerciseWMongoApplication.class, args);
    }

//    @Bean
//    CommandLineRunner init(CustomersRepository customersRepository) {
//
//        return args -> {
//            List<Customer> customers = customersRepository.findAll();
//            System.out.println(customers);
//
//            Customer customer = customersRepository.findFirstByCustomerId("5ca4bbcea2dd94ee58162a69");
//            System.out.println(customer);
//        };
//
//    }
}
