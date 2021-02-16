package com.example;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "regular")
public class Regular extends User{
	private int salary;
	public Regular(int id, String name, int salary) {
		super(id, name);
		this.salary = salary;
	}
	public Regular(int id, String name) {
		super(id, name);
	}
	public Regular() {
		super();
	}
	public Regular(String name, int salary) {
		super(name);
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}
