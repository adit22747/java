package com.cybage.threading;

public class Developer extends Thread {
	@Override
	public void run() {
		try{
			sleep(3*1000);
		}catch(InterruptedException e){
			System.err.println(e.getMessage());
		}
		System.out.println("1. i am developing " + getName());
	}
}
