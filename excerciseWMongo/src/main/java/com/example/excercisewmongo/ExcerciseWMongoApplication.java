package com.example.excercisewmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

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
