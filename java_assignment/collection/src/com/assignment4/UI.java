package com.assignment4;

import java.util.Hashtable;

public class UI {
	public static void main(String[] args) {
		BankApplication bank = new BankApplication();
		
		Hashtable<String, Integer> hash = new Hashtable<>();
		hash.put("SB_ACCOUNT", 1000);
		hash.put("CURR_ACCOUNT", 2000);
		Customer c1 =new Customer("adit",2345,hash);
		Customer c2 =new Customer("patel",12345,hash);
		bank.addNewCustomer(c1);
		bank.addNewCustomer(c2);
		bank.display();
		bank.depositeAmount("adit", "SB_ACCOUNT", 1000);
		bank.depositeAmount("patel", "CURR_ACCOUNT", 2000);
		System.out.println("---------------------------------");
		bank.display();
	}
}
