package com.cybage;

public interface employeeservice {
	public abstract void add(String name, String address,int compensation,String type);
	public abstract void displayall();
	public abstract void display();
	public abstract void delete(int id);
	public abstract void update(int id, employee emp);
}
