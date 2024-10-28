package com.mbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbs.entities.Customer;
import com.mbs.service.CustomerService;

@RestController
@RequestMapping("/customers")
@CrossOrigin
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
		
	}
	
	@PostMapping
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteCutomer(@PathVariable Long id) {
		customerService.deleteCustomer(id);
	}
	
	

}
