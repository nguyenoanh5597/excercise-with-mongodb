package com.example.excercisewmongo.repositories;

import com.example.excercisewmongo.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomersRepository extends MongoRepository<Customer, String> {
    Customer findCustomerById(String id);
    Customer findByUsername(String username);
}
