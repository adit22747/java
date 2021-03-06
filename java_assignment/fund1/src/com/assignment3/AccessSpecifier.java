package com.assignment3;

class Employee{
	  public String employeeName;
	  String address;
	  protected int age;
	  private double salary;

	  void setSalary(double sal){
	    salary = sal;
	  }
	  private double getSalary(){
	    return salary;
	  }
	  void showDetails(){
	    System.out.println("Employee's Name: "+employeeName);
	    System.out.println("Employee's Address: "+address);
	    System.out.println("Employee's Age: "+age);
	    System.out.println("Employee's Salary: "+salary); //1
	    System.out.println("Employee's salary: "+getSalary()); //2
	  }
	}

	class AccessSpecifier{
	  public static void main(String args[]){
	    Employee employee = new Employee();
	    employee.employeeName = "Ronaldo";
	    employee.address = "Portugal";
	    employee.age = 29;
	    //employee.salary = 65034.00;
	    employee.setSalary(65304.00);
	    //System.out.println("Employee's salary: "+employee.getSalary());
	    employee.showDetails();
	  }
	}

