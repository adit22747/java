package com.assignment2;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(){
		day=0;
		month=0;
		year=0;
	}
	
	public Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public static void main(String[] args) {
		Date d1 = new Date(12,10,2020);
		System.out.println(d1.toString());
	}
	
	
	
}
