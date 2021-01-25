package com.cybage;

public class retiredemployee extends employee {
	private int pension;

	public retiredemployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public retiredemployee(String name, String address, int pension) {
		super(name, address);
		// TODO Auto-generated constructor stub
		this.pension=pension;
	}

	public int getPension() {
		return pension;
	}

	public void setPension(int pension) {
		this.pension = pension;
	}

	public String toString() {
		return "retiredemployee [pension=" + pension + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getAddress()=" + getAddress()
				+ "]";
	}

	public int getcompensation() {
		// TODO Auto-generated method stub
		return this.pension;
	}
	

}
