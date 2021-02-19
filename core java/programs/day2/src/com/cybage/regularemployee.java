package com.cybage;

public class regularemployee extends employee{
	private int salary;

	public regularemployee() {
		super();
		
	}

	public regularemployee(String name, String address, int salary) {
		super(name, address);
		this.salary=salary;
		
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return "regularemployee [salary=" + salary + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getAddress()=" + getAddress()
				+ "]";
	}

	public int getcompensation() {
		// TODO Auto-generated method stub
		return this.salary;
	}
	
	

}
