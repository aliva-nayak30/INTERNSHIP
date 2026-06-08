package org.example.crudapplication.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;
@RestController
public class CustomerController {

    // Your existing endpoints
    @GetMapping("/hello")
    public String hello() {
        return "Hello Aliva";
    }

    @GetMapping("/greet/{value}")
    public String greet(@PathVariable String value) {
        return "Hello " + value + " Aliva";
    }

    // New endpoint 1: GET all customers
   /* @GetMapping("/customers")
    public String getAllCustomers() {
        return "All customers list";
    } */
    @GetMapping("/customers")
    public List<String> getAllCustomers() {
        List<String> customers = new ArrayList<>();
        customers.add("Aliva");
        customers.add("Ayra");
        customers.add("Priya");
        return customers;
    }

    // New endpoint 2: POST create customer
    @PostMapping("/customers")
    public String createCustomer() {
        return "New customer added";
    }
}