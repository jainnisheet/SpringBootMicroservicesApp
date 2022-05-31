package com.nisheet.microservices.main.controller;

import com.nisheet.microservices.main.entities.Beer;
import com.nisheet.microservices.main.entities.Customer;
import com.nisheet.microservices.main.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private CustomerService service;

    @Autowired
    public  CustomerController(CustomerService svc){
        service = svc;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable UUID id){
        return new ResponseEntity<>(service.getCustomerById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createCustomer(@RequestBody Customer customer){
        service.createCustomer(customer);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateCustomer(@PathVariable UUID id, @RequestBody Customer customer){
        service.updateCustomer(id, customer);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCustomer(@PathVariable UUID id){
        service.deleteCustomer(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
