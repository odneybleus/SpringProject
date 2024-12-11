package com.revature.services;

import com.revature.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerDao customerDao;

    @Autowired
    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
