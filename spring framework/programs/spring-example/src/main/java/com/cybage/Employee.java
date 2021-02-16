package com.cybage;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private Address address;
	private List<String> skills;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Employee(int id, String name, Address address, List<String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", skills=" + skills + "]";
	}

	public Employee() {
		super();
	}

	public void myInit() {
		System.out.println("bean initialized");
	}

	public void myDestroy() { // bean will destroy when we shutdown the container
		System.out.println("bean destroyed");
	}

}