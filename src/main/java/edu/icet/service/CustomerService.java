package edu.icet.service;

import edu.icet.model.dto.Customer;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void save(Customer customer) {

        CustomerEntity customerEntity = new CustomerEntity(
                customer.getCustomerid(),
                customer.getName(),
                customer.getEmail(),
                customer.getPhone(),
                customer.getAddress()

        );
        customerRepository.save(customerEntity);
    }

    public List<Customer> getAlldetails() {

        List<CustomerEntity> customerEntities = customerRepository.findAll();
        List<Customer> customers = new ArrayList<>();

        for (CustomerEntity customerEntity : customerEntities) {
            customers.add(new Customer(

                    customerEntity.getCustomerid(),
                    customerEntity.getName(),
                    customerEntity.getEmail(),
                    customerEntity.getPhone(),
                    customerEntity.getAddress()
                    )
            );
        }
        return customers;
    }
}



