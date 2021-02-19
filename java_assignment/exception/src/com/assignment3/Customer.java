package com.assignment3;



public class Customer {
	private String name;
	private String address;
	private double accnum;
	private int current_bal;
	private Account acc;
	public Customer(String name, String address, double accnum, int current_bal, Account acc) {
		this.name = name;
		this.address = address;
		this.accnum = accnum;
		this.current_bal = current_bal;
		this.acc = acc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getAccnum() {
		return accnum;
	}
	public void setAccnum(double accnum) {
		this.accnum = accnum;
	}
	public int getCurrent_bal() {
		return current_bal;
	}
	public void setCurrent_bal(int current_bal) {
		this.current_bal = current_bal;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", accnum=" + accnum + ", current_bal=" + current_bal
				+ ", acc=" + acc + "]";
	}
	
	
	
}
