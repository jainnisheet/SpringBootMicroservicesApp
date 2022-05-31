package com.nisheet.microservices.main.service;

import com.nisheet.microservices.main.entities.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public Customer getCustomerById(UUID id) {
        return Customer.builder().customerId(id)
                .customerName("Nisheet")
                .build();
    }

    @Override
    public void createCustomer(Customer customer) {
        Customer.builder().customerId(UUID.randomUUID())
                .customerName("Nisheet")
                .build();
    }

    @Override
    public void deleteCustomer(UUID id) {

    }

    @Override
    public void updateCustomer(UUID id, Customer customer) {

    }
}
