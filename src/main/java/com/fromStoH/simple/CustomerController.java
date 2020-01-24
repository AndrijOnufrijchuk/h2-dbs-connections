package com.fromStoH.simple;

import com.fromStoH.simple.customer.Customer;
import com.fromStoH.simple.customer.CustomerCreationRequest;
import com.fromStoH.simple.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;
    CustomerCreationRequest customerCreationRequest;

    @GetMapping("/customers")
    private List<Customer> getAllCustomer() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/customers/{id}")
    private Customer getCustomer(@PathVariable("id") int id) {
        return customerService.getCustomerById(id);
    }

    @DeleteMapping("/customers/{id}")
    private void deleteCustomer(@PathVariable("id") int id) {
        customerService.delete(id);
    }

    @PostMapping("/customers")
    private String saveCustomer(@RequestBody CustomerCreationRequest customer) {
        customerService.create(customer);
        return customer.getName();
    }
}