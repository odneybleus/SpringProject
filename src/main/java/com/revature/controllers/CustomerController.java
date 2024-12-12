package com.revature.controllers;

import com.revature.models.Customers;
import com.revature.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("customers")
// http://localhost:8080/customers
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customers> getAllCustomersHandler(){
        return customerService.getAllCustomers();
    }

    @PostMapping
    public ResponseEntity<Customers> createCustomerHandler(@RequestBody Customers customers){
       Customers possibleCustomer = customerService.createNewCustomers(customers);
       if(possibleCustomer == null){
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
       }else{
           return new ResponseEntity<>(possibleCustomer, HttpStatus.CREATED);
       }
    }

    @GetMapping("{customerId}") //http://localhost:8080/customers/{customerId}
    public ResponseEntity<Customers> getSpecificCustomer(@PathVariable int customerId){
            Optional<Customers> possibleCustomer = customerService.getCustomerById(customerId);
            if (possibleCustomer.isPresent()){
                return new ResponseEntity<>(possibleCustomer.get(), HttpStatus.OK);
            }else{
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
    }
}
