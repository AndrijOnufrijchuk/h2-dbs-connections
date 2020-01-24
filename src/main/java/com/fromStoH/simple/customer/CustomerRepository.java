package com.fromStoH.simple.customer;

import com.fromStoH.simple.customer.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}