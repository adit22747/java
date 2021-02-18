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
	
	@Autowired
	UserRepository ur;
	
	@Autowired
	AccountRepository ar;

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		Account acc1 = new Account("account1");
		Account acc2 = new Account("account2");
		List<Account> account = new ArrayList<Account>();
		account.add(acc1);
		account.add(acc2);
		user.setAccount(account);
		user.setName("name1");
		ur.save(user);
		
	}



}
