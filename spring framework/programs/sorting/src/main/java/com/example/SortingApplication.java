package com.example;

import java.beans.JavaBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

@JavaBean(defaultProperty="entityManagerFactory")

@SpringBootApplication
public class SortingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SortingApplication.class, args);
		
	}
	
	@Autowired
	EmployeeRepository er;

	@Override
	public void run(String... args) throws Exception {
		er.save(new Employee("adit"));
		er.save(new Employee("mdit"));
		er.save(new Employee("bdit"));
		er.save(new Employee("xdit"));
		er.save(new Employee("tdit"));
		
		System.out.println("--------------------------");
		System.out.println(er.findAll(Sort.by(Sort.Direction.ASC,"id")));
		
		System.out.println("----------------------------");
		Page<Employee> page = er.findAll(PageRequest.of(0, 4));
		System.out.println(page.getTotalPages());
		
	}

}
