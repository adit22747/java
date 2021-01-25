package com.assignment3;

public class Book {
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + "]";
	}
	public Book(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	
}
