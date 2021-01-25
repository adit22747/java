package com.cybage.threading;

public class Deployment extends Thread {
	@Override
	public void run() {
		try{
			sleep(9*1000);
		}catch(InterruptedException e){
			System.err.println(e.getMessage());
		}
		System.out.println("3. i am delpoying " + getName());
	}
}
