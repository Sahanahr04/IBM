package com.example.demo.repo;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.example.demo.model.*;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

	
	private final Map<String,Customer> customers;
	
	{
		customers=new HashMap<String,Customer>();
		
	}

	@Override
	public Customer createCustomer(Customer customer) {
		//customers.put(new Random().nextInt(1000), customer);
		customers.put(customer.getCustomerId(), customer);
		
		return customer ;
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		Collection<Customer>collections=customers.values();
		return collections;
	}

	@Override
	public Customer getCustomerById(String customerId) {
		// TODO Auto-generated method stub
		Customer customer=customers.get(customerId);
		if(customer==null)
		{
			return null;
		}
		else
		{
			return customer;
		}
	}

	@Override
	public Customer updateCustomerById(String customerId, Customer customer) {
		// TODO Auto-generated method stub
		Customer tempcustomer=customers.get(customerId);
		if(customer==null)
		{
			return null;
		}
		else
		{
			tempcustomer.setFirstName(customer.getFirstName());
			tempcustomer.setLastName(customer.getLastName());
			tempcustomer.setEmail(customer.getEmail());
			return tempcustomer;
		}
		
	}

	@Override
	public String deleteCustomerById(String customerId) {
		// TODO Auto-generated method stub
		Customer tempocustomer=customers.get(customerId);
		if(tempocustomer!=null)
		{
			customers.remove(customerId);
			return "removed";
		}
		else
		{
			return "customer not found";
		}
		
		
	}
	
}

