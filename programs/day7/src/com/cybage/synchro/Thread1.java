package com.cybage.synchro;

public class Thread1 extends Thread {
	private Account account;
	
	public Thread1(Account account){
		this.account = account;
	}
	@Override
	public void run() {
		account.print(10);
	}
}
