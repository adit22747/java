package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public List<Employee> findAllByOrderByName();
	
	@Query(value = "select * from employee order by name desc" ,nativeQuery = true)
	public List<Employee> myMethod();

}
