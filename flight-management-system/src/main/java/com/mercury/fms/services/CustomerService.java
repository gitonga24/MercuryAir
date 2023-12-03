package com.mercury.fms.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mercury.fms.models.Customer;
import com.mercury.fms.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepo;
	

	
	//Get All Customers
	public List<Customer> getAllCustomers(){
		return customerRepo.findAll();
	}
	
	//Add customer	
	public ResponseEntity<String> addCustomer(Customer customer) {		
		
		if(customer.getId() != null ) {
			return new ResponseEntity<>("Customer ID is AUTO generated and should not be provided", HttpStatus.BAD_REQUEST);			
		}
		else {
		customerRepo.save(customer);
		return new ResponseEntity<>("Customer Id " + customer.getId()+ " Has Been successfully added", HttpStatus.OK);
		}	
	}
	
	
	//Add customers
	public String addCustomers(List<Customer> customers) {
		customerRepo.saveAll(customers);
		return "success - customers added successfully";
			
		}
	
	
	//Delete Customer
	public ResponseEntity<String> deleteCustomer (Customer customer) {	
		if(customerRepo.existsById(customer.getId())) {
		customerRepo.delete(customer);
		return new ResponseEntity<>("Customer Id " + customer.getId()+ " Has Been successfully deleted", HttpStatus.OK);
		}
		else  return new ResponseEntity<>( "Customer Id " + customer.getId()+ " Not found", HttpStatus.BAD_REQUEST);
	}


	//Modify Customer
	public ResponseEntity<String> modifyCustomer(Customer customer) {
		if(customerRepo.existsById(customer.getId())){	
		customerRepo.save(customer);
		return new ResponseEntity<>("Customer Id " + customer.getId()+ " Has been successfully updated", HttpStatus.OK);
		}
		else
		return new ResponseEntity<>("Customer Id " + customer.getId()+ " Not found", HttpStatus.BAD_REQUEST);
	}
	
	
	//Find records by customer firstName
	public List<Customer> findByCustomerFirstName(String lastname){
		return customerRepo.findBylastname(lastname);
	}
	
	
	
	
}
