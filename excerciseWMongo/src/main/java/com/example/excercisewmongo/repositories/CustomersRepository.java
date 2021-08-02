package com.example.excercisewmongo.repositories;

import com.example.excercisewmongo.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomersRepository extends MongoRepository<Customer, String> {
//    List<Customer> findCustomerByLastName(@Param("name") String name);
//    Customer findCustomerById(String id);
}
