package com.example.excercisewmongo.service;

import com.example.excercisewmongo.entity.Customer;
import com.example.excercisewmongo.repositories.CustomersRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {

    @Mock
    private CustomersRepository repository;

    @Test
    public void test() {
        Customer c1 = new Customer();
        c1.setName("Oanh");
        c1.setUsername("oanh123");

        Customer c2 = new Customer();
        c2.setName("Yen Oanh");
        c2.setUsername("yenoanh111");

        Customer c3 = new Customer();
        c3.setName("Phu");
        c3.setUsername("phu567");

        Mockito.when(repository.findAll()).thenReturn(Arrays.asList(c1, c2, c3));

        CustomerService s = new CustomerServiceImpl(repository);
        List<Customer> customers = s.findCustomersByName("Oanh");
        Assert.assertEquals(1, customers.size());
    }

    @Test
    public void test2() {
        CustomersRepository customersRepository = Mockito.mock(CustomersRepository.class);
        Mockito.when(customersRepository.findAll()).thenThrow(new RuntimeException("foooo"));
        CustomerService s = new CustomerServiceImpl(customersRepository);
        List<Customer> customers = s.findCustomersByName("Oanh");
        Assert.assertEquals(0, customers.size());
    }

    @Test
    public void test3() {
        Customer c1 = new Customer();
        c1.setName("Oanh");
        c1.setUsername("oanh123");

        Mockito.when(repository.findByUsername(Mockito.eq("oanh123")))
            .thenReturn(c1);

        Mockito.when(repository.save(Mockito.any())).thenReturn(c1);

        CustomerService s = new CustomerServiceImpl(repository);
        Customer output = s.updateNameByUser("oanh123", "Yen Oanh");

        Assert.assertEquals("Yen Oanh", output.getName());
        Assert.assertEquals("oanh123", output.getUsername());
    }
}
