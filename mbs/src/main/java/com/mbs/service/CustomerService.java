package com.mbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbs.entities.Customer;
import com.mbs.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer addCustomer(Customer customer ) {
		return customerRepository.save(customer);
	
	}
	public List<Customer>getAllCustomer(){
		return customerRepository.findAll();
		
	}
	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
	}

}
