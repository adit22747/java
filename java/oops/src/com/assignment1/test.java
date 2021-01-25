package com.assignment1;

class Employee {
	protected int salary;
	protected int days;
	private int id;
	private String name;

	public Employee(int salary, int days, int id, String name) {

		this.salary = salary;
		this.days = days;
		this.id = id;
		this.name = name;
	}

	public int sal() {
		return 0;
	}
}

class manager extends Employee {
	private int allowance;

	public manager(int salary, int days, int id, String name, int allowance) {
		super(salary, days, id, name);
		this.allowance = allowance;
	}

	public int sal() {
		int total = (salary * days) + allowance;
		return total;
	}

}

class salesManager extends Employee {
	private int commision;

	public salesManager(int salary, int days, int id, String name, int commision) {
		super(salary, days, id, name);
		this.commision = commision;
	}

	public int sal() {
		int total = (salary * days) + commision;
		return total;
	}

}

public class test {
	public static void main(String[] args) {
		manager mng = new manager(1000, 30, 2, "manager", 1000);
		System.out.println("manager salary = " + mng.sal());
		salesManager smng = new salesManager(12000, 30, 2, "sales manager",
				1000);
		System.out.println("sales manager salary = " + smng.sal());
	}
}
