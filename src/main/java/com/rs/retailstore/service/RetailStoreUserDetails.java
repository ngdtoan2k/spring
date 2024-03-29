package com.rs.retailstore.service;

import com.rs.retailstore.model.Customer;
import com.rs.retailstore.reponsetory.CustomerReponsetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RetailStoreUserDetails implements UserDetailsService {
    @Autowired
    private CustomerReponsetory customerReponsetory;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<Customer> customer = customerReponsetory.findByUsername(username);
        String password = null;
        List<GrantedAuthority> authorities =null;
        if(customer.isEmpty()){
            throw new UsernameNotFoundException("user name not found: "+username);
        }
        username = customer.get(0).getUsername();
        password = customer.get(0).getPassword();
        authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(customer.get(0).getRole()));

        return new User(username, password ,authorities);
    }
}
