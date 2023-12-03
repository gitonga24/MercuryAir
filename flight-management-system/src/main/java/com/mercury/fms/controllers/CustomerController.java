package com.mercury.fms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mercury.fms.models.Customer;
import com.mercury.fms.services.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	
	//Find all customers
	@GetMapping("customers")
	public List<Customer> findAllCustomers(){		
		return customerService.getAllCustomers();		
	}
	
	
	//Find customers by First Name
	@GetMapping("findByCustomerLastName/{lastName}")
	public List<Customer> findByCustomerFirstName(@PathVariable String lastName){		
		return customerService.findByCustomerFirstName(lastName);		
	}
	
	
	//Add customer
	@PostMapping("addCustomer")
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);	
	}
		
	//Add customers
	@PostMapping("addCustomers")
	public String addCustomers(@RequestBody List<Customer> customers) {
		System.out.println("addCustomer Method in Controller class has been invoked.");
		return customerService.addCustomers(customers);	
	}
		
	//Modify customer
	@PutMapping("modifyCustomer")
	public ResponseEntity<String> modifyCustomer(@RequestBody Customer customer) {
		return customerService.modifyCustomer(customer);	
	}
		

	//Delete customer
	@DeleteMapping("deleteCustomer")
	public ResponseEntity<String> DeleteCustomerById(@RequestBody Customer customer){		
		return customerService.deleteCustomer(customer);
	}
		
	
}
