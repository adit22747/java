package com.assignment4;

public class constructor {
	private int id;
	private String name;
	
	public constructor(){
		id=0;
		name="default";
	}
	
	public constructor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	


	public String toString() {
		return "constructor [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		constructor obj1 = new constructor();
		constructor obj2 = new constructor(12,"value");
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}
