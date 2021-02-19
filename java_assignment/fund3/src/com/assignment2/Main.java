package com.assignment2;

public class Main {
	public static void main(String args[]){
	     
	     Employee[] obj = new Employee[2] ;
	 
	    
	     obj[0] = new Employee();
	     obj[1] = new Employee();
	 
	     
	     obj[0].setData(100,"ABC");
	     obj[1].setData(200,"XYZ");
	 
	   
	     System.out.println("Employee Object 1:");
	     obj[0].showData();
	     System.out.println("Employee Object 2:");
	     obj[1].showData();
	  }
}
