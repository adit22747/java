package com.assignment2;

class bank {
	protected double interest;
	protected int balance;
	private int id;
	private String name;

	public bank(double interet, int balance, int id, String name) {

		this.interest = interet;
		this.balance = balance;
		this.id = id;
		this.name = name;
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

	public double cal() {
		return 0;
	}
}

class saving extends bank {

	public saving(double d, int balance, int id, String name) {
		super(d, balance, id, name);
	}

	public double cal() {
		return interest * balance;
	}

}

class current extends bank {

	public current(double interet, int balance, int id, String name) {
		super(interet, balance, id, name);
	}

	public double cal() {
		return interest * balance;
	}

}

public class test {
	public static void main(String[] args) {
		saving sav = new saving(0.4, 1000, 1, "adit");
		System.out.println("name: "+ sav.getName() + "calculated rate for saving:" + sav.cal());
		current cur = new current(0.6, 1000, 1, "adit");
		System.out.println("name: "+ cur.getName() + "calculated rate for current:" + cur.cal());
	}
}
