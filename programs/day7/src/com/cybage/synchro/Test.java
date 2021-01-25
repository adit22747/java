package com.cybage.synchro;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Account account = new Account();
		
		Thread t1 = new Thread1(account);
		Thread t2 = new Thread2(account);
		
		t2.start();
		t1.start();
		
//		t1.join();
//		t2.join();
	}
}
