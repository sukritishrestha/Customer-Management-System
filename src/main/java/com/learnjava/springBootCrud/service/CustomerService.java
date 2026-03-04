package com.learnjava.springBootCrud.service;

import com.learnjava.springBootCrud.model.Customer;
import com.learnjava.springBootCrud.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    //Add methods for business logic
    //Get all the users from database
    public List<Customer> getAllCustomers(){
        return (List<Customer>) customerRepository.findAll();
    }
    //Get users by id
    public Optional<Customer> findById(Long id){
        return customerRepository.findById(id);
    }
    //save users in database
    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }
    public void deleteById(Long id){
        customerRepository.deleteById(id);
    }

}
