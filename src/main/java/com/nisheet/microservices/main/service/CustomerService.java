package com.nisheet.microservices.main.service;

import com.nisheet.microservices.main.entities.Customer;

import java.util.UUID;

public interface CustomerService {
    Customer getCustomerById(UUID id);

    void deleteCustomer(UUID id);

    void updateCustomer(UUID id, Customer customer);

    void createCustomer(Customer customer);
}
