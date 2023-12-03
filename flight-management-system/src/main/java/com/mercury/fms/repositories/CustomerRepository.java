package com.mercury.fms.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mercury.fms.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	public List<Customer> findBylastname (String lastname);
}
