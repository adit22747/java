package com.cybage.threading;

public class Tester extends Thread {
	@Override
	public void run() {
		try{
			sleep(6*1000);
		}catch(InterruptedException e){
			System.err.println(e.getMessage());
		}
		System.out.println("2. i am testing " + getName() );
	}
}