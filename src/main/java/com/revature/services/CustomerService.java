package com.revature.services;

import com.revature.dao.CustomerDao;
import com.revature.models.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerDao customerDao;

    @Autowired
    public CustomerService(CustomerDao customerDao) {

        this.customerDao = customerDao;
    }

    // get customer by ID Method
    public Optional<Customers> getCustomerById(int customerId){
        return customerDao.findById(customerId);
    }

    //get all customer method
    public List<Customers> getAllCustomers(){
        return customerDao.findAll();
    }

    //Create customer Method

    public Customers createNewCustomers(Customers customers){
        if (customers.getPurchaseAmount() < 0){
            return null;
        }
        return customerDao.save(customers);
    }

}
