package com.learnjava.springBootCrud.repository;

import com.learnjava.springBootCrud.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long> {

}
