package com.assignment4;

public class Employee {
	private String type;
	private int stock;
	public Employee(String type, int stock) {
		super();
		this.type = type;
		this.stock = stock;
	}
	public String toString() {
		return "Employee [type=" + type + ", stock=" + stock + "]";
	}
	
	
}
