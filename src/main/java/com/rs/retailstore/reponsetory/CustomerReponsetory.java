package com.rs.retailstore.reponsetory;

import com.rs.retailstore.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerReponsetory extends CrudRepository<Customer, Integer> {
    List<Customer> findByUsername(String username);
}

