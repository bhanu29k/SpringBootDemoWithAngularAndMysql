package com.niit.techleap.SpringBootProject.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.niit.techleap.SpringBootProject.CustomerNotFound;
import com.niit.techleap.SpringBootProject.model.Customer;
import com.niit.techleap.SpringBootProject.service.CustomerService;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
public class CustomerRestController {
	
	@Autowired
	CustomerService service;
	
	@GetMapping("/welcome")	 
	public String welcome()
	{
	return "welcome to REST String boot";
	}
	 
	//localhost:9988/cust/121
	
	@GetMapping("/cust/{id}")
	public Optional<Customer> getCustomer(@PathVariable("id") int id)
	{
		Optional<Customer> cust=service.getCustomer(id);
		if(cust==null)
			throw new CustomerNotFound();
		
		return cust; 
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomers()
	{
		return service.getCustomers();
	}
	
	/*
	@PostMapping("/customer")
	public List<Customer> addCustomer( @RequestBody Customer custom)
	{
		return service.addCustomer(custom);
		
		
	}
	*/
	
	//200 ok -> 201 Created
	@PostMapping("/customer")
	public Customer addCustomer( @RequestBody Customer custom)
	{
		Customer c=new Customer();
		c=service.addCustomer(custom);
		
		return c;
		
	}
	
	
	
	@DeleteMapping("customer/{id}")
	public List<Customer> deleteCustomer(@PathVariable("id") int id)
	{
		return service.deleteCustomer(id);
	}
	
	@PutMapping("/upcustomer/{id}")
	public Customer update(@RequestBody Customer customer,@PathVariable("id") int id) {
		return service.updateCustomer(customer,id);
	}
	
}
