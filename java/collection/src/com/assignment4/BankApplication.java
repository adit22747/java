package com.assignment4;

import java.util.Hashtable;

public class BankApplication {
	private Hashtable<String,Customer> accountInfo = new Hashtable(); 
	public void addNewCustomer(Customer c) {
		accountInfo.put(c.getName(), c);
	}
	public void depositeAmount(String name, String acc_type, int amount){
		Customer c = accountInfo.get(name);
		c.depositeAmount(acc_type, amount);
	}
	public void display() {
		System.out.println(accountInfo);
	}
}
