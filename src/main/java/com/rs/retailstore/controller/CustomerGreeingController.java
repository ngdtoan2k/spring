package com.rs.retailstore.controller;

import com.rs.retailstore.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/v1")
public class CustomerGreeingController {
    private static  final String greetingTemplate = "hello, %s %s";
    private  final AtomicLong couter = new AtomicLong();
    @GetMapping("/greeing")
    public Greeting greeting(@RequestParam(value = "gender" ,defaultValue = "0")boolean gender,
                         @RequestParam(value = "customerName", defaultValue = "custumer") String customerName ){
        return Greeting.builder()
                .id(couter.incrementAndGet())
                .content(String.format(greetingTemplate,gender ?"Mr.":"Mrs.",customerName))
                .build();
    }
}
