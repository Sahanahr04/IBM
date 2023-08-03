package com.example.demo.repo;

import java.util.Collection;
import java.util.List;

import org.springframework.http.ResponseEntity;
import com.example.demo.model.Customer;


public interface CustomerRepository {

	//methods 
	Customer createCustomer(Customer customer);
	
	Collection<Customer> getAllCustomers();
	
	Customer getCustomerById(String customerId);
	
	Customer updateCustomerById(String customerId,Customer customer);
	
	String deleteCustomerById(String customerId);
	
	}
