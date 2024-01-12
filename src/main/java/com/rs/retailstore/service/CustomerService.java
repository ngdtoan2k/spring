package com.rs.retailstore.service;

import com.rs.retailstore.model.Customer;
import com.rs.retailstore.reponsetory.CustomerReponsetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    CustomerReponsetory customerReponsetory;
    public Customer createCustomer(Customer customer){
        String password = passwordEncoder.encode(customer.getPassword());
        customer.setPassword(password);
        return customerReponsetory.save(customer);
    }
}
