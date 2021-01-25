package com.assignment4;

public class Manager {
	private String type;
	private int stock;
	public Manager(String type, int stock) {
		this.type = type;
		this.stock = stock;
	}
	public String toString() {
		return "Employee [type=" + type + ", stock=" + stock + "]";
	}
	
	
}

