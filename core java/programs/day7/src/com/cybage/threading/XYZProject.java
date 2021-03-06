package com.cybage.threading;

public class XYZProject {
	//main thread will be started
	public static void main(String[] args) throws InterruptedException {
		System.out.println("multithreading");
		System.out.println("name of thread :"+Thread.currentThread().getName());
		System.out.println("id of thread :"+Thread.currentThread().getId());
		
		Developer d1  = new Developer();
		Tester t1 = new Tester();
		Deployment dp = new Deployment();
		
		d1.setName("developer");
		d1.setPriority(1);
		t1.setPriority(2);
		dp.setPriority(3);

		d1.start(); //it will call run method
		t1.start();
		dp.start();
		
		//we need to wait till the execution of all the threads
		d1.join(3*1000);
		t1.join(3*1000);
		dp.join(3*1000);
		
		System.out.println("4. we have finished");
	}
}
