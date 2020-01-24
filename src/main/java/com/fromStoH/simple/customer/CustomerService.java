package com.fromStoH.simple.customer;

import com.fromStoH.simple.customer.Customer;
import com.fromStoH.simple.customer.CustomerRepository;
import com.fromStoH.simple.market.Market;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    CustomerCreationRequest customerCreationRequest;
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<Customer>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    public Customer getCustomerById(int id) {
        return customerRepository.findById(id).get();
    }

    public void create(CustomerCreationRequest customer) {
        Customer customerCreationRequest = new Customer();
        customerCreationRequest.setName(customer.getName());
        customerCreationRequest.setAge(customer.getAge());
        customerCreationRequest.setMarket(customer.getMarket());
        customerRepository.save(customerCreationRequest);
    }

    public void delete(int id) {
        customerRepository.deleteById(id);
    }
}
/*


    public void saveOrUpdate(ConsumerCreationRequest consumer) {
        Consumer consumerEntity = new Consumer();
        consumerEntity.setName(consumer.getName());
        consumerRepo.save(consumerEntity);
    }
 */