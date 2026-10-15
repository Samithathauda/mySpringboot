package com.example.RealProject.controller;

import com.example.RealProject.service.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    CustomerService  customerService1;

    public CustomerController(CustomerService customerService) {
        customerService1 = customerService;
    }


    //sdfgdsgdsgdssdgdsgsgsgsdfgdsgfdsg

    @GetMapping("/{id}")
    public String getCustomer(@PathVariable String id) {

        System.out.println(id);
        return customerService1.getCustomer(id,"SAMITH");

        //return "Customer IDerterttttt: " + id;
    }
}