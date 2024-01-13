package com.rs.retailstore.controller;

import com.rs.retailstore.model.Customer;
import com.rs.retailstore.model.RegisterRequest;
import com.rs.retailstore.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")

public class RegisterController {
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@Valid @RequestBody RegisterRequest registerRequest) {
        // Xử lý logic đăng ký người dùng
        // Ví dụ: lưu thông tin đăng ký vào cơ sở dữ liệu

        // In ra thông tin người dùng đã đăng ký
        System.out.println("Username: " + registerRequest.getUsername());
        System.out.println("Password: " + registerRequest.getPassword());

        return ResponseEntity.ok("User registered successfully");
    }
//    @Autowired
//    CustomerService customerService;

//  @PostMapping("/register")
//    public ResponseEntity<String> registerCustomer(@RequestBody Customer customer) {
//        ResponseEntity<String> response = null;
//        try {
//            Customer saveCustomer = customerService.createCustomer(customer);
//            if (saveCustomer.getId() > 0) {
//                response = ResponseEntity.status(HttpStatus.CREATED)
//                        .body("custumer is created sucessfully for custumer" + customer.getUsername());
//
//            }
//        } catch (Exception exception) {
//            response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                    .body("an exception occured from service with exception" + exception);
//        }
//        return response;
//    }

}
