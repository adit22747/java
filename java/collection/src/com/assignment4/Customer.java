package com.assignment4;

import java.util.Hashtable;

public class Customer {
	private String custName = null; 
	private int ACC_NO = 0; 
	private Hashtable accountInfo = new Hashtable(); 
	void depositeAmount(int ACC_TYPE, int amount) {
		
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getACC_NO() {
		return ACC_NO;
	}
	public void setACC_NO(int aCC_NO) {
		ACC_NO = aCC_NO;
	}
	
}
