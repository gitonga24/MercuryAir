package com.mercury.fms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mercury.fms.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
