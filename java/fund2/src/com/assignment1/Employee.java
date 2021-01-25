package com.assignment1;

public class Employee {
	private int id;
	private String name;
	public Employee() {
		id=0;
		name="default";
	}
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
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setId(2);
		emp1.setName("adit");
		System.out.println("id:"+emp1.getId());
		System.out.println("name:"+emp1.getName());
	}
	
}
