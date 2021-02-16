package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaExampleApplication.class, args);
	}

//	@Autowired
//	EmployeeRepository er;
	

//	@Override
//	public void run(String... args) throws Exception {
//		List<String> phones = new ArrayList<>();
//		phones.add("90111");
//		phones.add("901223");
//		er.save(new Employee("adit5",phones));
//
//	}
	
	@Autowired
	UserRepository er;
	RegularRepository rr;
	RetiredRepository retRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		er.save(new User("dm101"));
		rr.save(new Regular("dm102",12345));
		retRepo.save(new Retired("dm103",100));
	}

}
