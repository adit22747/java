package com.assignment2;

public class Employee {
	int empId;
    String name;
    public void setData(int c,String d){
        empId=c;
        name=d;
     }
    public void showData(){
        System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
        System.out.println();
     }
}
