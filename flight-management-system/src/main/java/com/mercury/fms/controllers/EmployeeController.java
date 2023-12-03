package com.mercury.fms.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercury.fms.models.Employee;
import com.mercury.fms.services.EmployeeService;



@RestController
public class EmployeeController {

	@Autowired private EmployeeService employeeService;
	
	//Add New 
		@PostMapping(value="employees/addNew")
		public String addNew(Employee employee) {
			employeeService.save(employee);
			return "redirect:/employees";
		}
		
		
		
		@GetMapping("employees")
		public List<Employee> findAll(){
		return  employeeService.findAll();	
		}
	
		
		
		
}
