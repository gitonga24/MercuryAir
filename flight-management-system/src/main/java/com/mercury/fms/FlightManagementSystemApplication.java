package com.mercury.fms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mercury.fms.models.Customer;
import com.mercury.fms.services.CustomerService;

@SpringBootApplication
public class FlightManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightManagementSystemApplication.class, args);
		System.out.println("Here we go");
		
	}

}
