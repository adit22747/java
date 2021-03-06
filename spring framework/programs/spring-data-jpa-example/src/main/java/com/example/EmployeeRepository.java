package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	List<Employee> findByName(String name);
	//spring data jpa will implement all methods related to emp entity
	
	
}
