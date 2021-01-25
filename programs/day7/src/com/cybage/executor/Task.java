package com.cybage.executor;

public class Task extends Thread {
	@Override
	public void run() {
		System.out.println("i am performing large task: " + currentThread().getName());
		for (int i = 0; i < 1000000; i++) {
			int sum = i + 10;
		}
	}
}
