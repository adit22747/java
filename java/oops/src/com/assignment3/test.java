package com.assignment3;

import java.util.Scanner;

class employee{
	private int empid;
	private String name;
	
	public void add(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
	    String name = sc.nextLine();
	    System.out.println("enter id");
	    int id =sc.nextInt();
		empid=id;
		this.name=name;
	}
	
	public void display(){
		System.out.println("name: " + name);
		System.out.println("empid: " + empid);
	}
}

public class test {
	public static void main(String[] args) {
		employee emp=new employee();
		int terminate=0;
		int menu;
		while(terminate!=4){

		System.out.println("--------------Menu-------------- "
				+ "1. Enter Data "
				+ "2. Display Data "
				+ "3. Exit ");
		Scanner sc = new Scanner(System.in);
		menu = sc.nextInt();
		
			switch (menu) {
			   case 1:
			    emp.add();
			    break;
			   case 2:
			    emp.display();
			    break;
			   case 3:
				System.exit(0);
			   default:
				System.out.println("Invalid input - Wrongnumber.");
				 break; 
			  }
		}
	}
}
