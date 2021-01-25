package com.cybage;

public class employeeserviceimpl implements employeeservice {
	
	private employee emp[]=new employee[10];
	private static int count=0;
	//instance initializer block , it executes before constructor
	{
		emp[count]=new regularemployee("regular","pune101",123);
		count++;
		emp[count]=new retiredemployee("retired","pune 102",12345);
		count++;
	}

	public void add(String name, String address,int compensation,String type) {
		// TODO Auto-generated method stub
		System.out.println("adding new enployee");
		if(type.equals("REG")){
			emp[count]=new regularemployee(name,address,compensation);
			count++;
		}
		else if(type.equals("RET")){
			emp[count]=new retiredemployee("retired","pune 102",12345);
			count++;
		}
		else{
			System.out.println("invlaid type");
		}
		
		
	}

	public void displayall() {
		// TODO Auto-generated method stub
		System.out.println("display");
		for (employee e : emp) {
			System.out.println(e);
		}
	}
	
	public void display() {
		// TODO Auto-generated method stub
		//System.out.println("display");
		for (employee e : emp) {
			System.out.println("id:"+e.getId()+"comp:"+e.getcompensation());
		}
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
		
	}

	public void update(int id, employee emp1) {
		// TODO Auto-generated method stub
				emp1.setAddress("hello world");
				System.out.println("Updated"+emp1.getAddress());

		
	}
	
}
