package com.cybage;

public class employeetest {
	public static void main(String[] args) {
//		System.out.println("employee demo..");
//		employee e1=new employee();
//		employee e2=new employee("dm101","pune");
//		System.out.println(e1);     //System.out.println(e1.toString()); both are same things
//		System.out.println(e2);
		
//		e2.setAddress("changed");
//		System.out.println(e2.getAddress());
//		System.out.println(e2);
		
//		System.out.println("-------regular employee---------");
//		employee e3=new regularemployee("regular","pune",121212);
//		System.out.println(e3);
//		System.out.println(e3.getcompensation());
//		
//		System.out.println("-------retired employee---------");
//		employee e4=new retiredemployee("retired","mumbai",1256212);
//		System.out.println(e4);
//		System.out.println(e4.getName());
		
		employeeserviceimpl empservice = new employeeserviceimpl();
		//add one regular employee
		empservice.add("reg","address",456,"REG");
		//add one retired employee
		empservice.add("ret","address",456,"RET");
		//display all
		empservice.displayall();
		
		System.out.println("----------------------------");
		//empservice.display();
		
		System.out.println("delete");
		employee emp1=new regularemployee();
		empservice.add("reg","temp",456,"REG");
		System.out.println("---------------------BEFORE UPDATE-----------------");
		System.out.println(emp1);
		empservice.update(456,emp1);
		System.out.println("---------------------AFTER UPDATE-----------------");
		System.out.println(emp1);
	}
}
