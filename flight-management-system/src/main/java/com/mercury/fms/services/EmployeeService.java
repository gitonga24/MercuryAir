package com.mercury.fms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercury.fms.models.Employee;
import com.mercury.fms.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	//save
		public void save (Employee employee) {
			employeeRepo.save(employee);
		}
	
		public List<Employee> findAll(){
			return employeeRepo.findAll();
		}
}
