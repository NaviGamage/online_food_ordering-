package edu.icet.controller;

import edu.icet.model.dto.Customer;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/save")
    public Customer save(@RequestBody Customer customer){
        customerService.save(customer);
        return customer;
    }

    @GetMapping("/all")
    public List<Customer> getDetails(){
        return customerService.getAlldetails();
    }
}
