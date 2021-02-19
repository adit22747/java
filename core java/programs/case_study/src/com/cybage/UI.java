package com.cybage;


import java.util.Scanner;


import com.cybage.service.EmployeeService;
import com.cybage.service.EmployeeServieImpl;


public class UI {
	public static void main(String[] args) throws Exception {
		System.out.println("employee demo...");
		int id, count = 0;
		String name, address;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.to add values");
		System.out.println("2.to display values");
		System.out.println("3.to delete values");
		System.out.println("4.to update values");
		System.out.println("5. to exit");

		EmployeeService empService = new EmployeeServieImpl();

		while (count < 5) {
			System.out.println("enter number");
			count = sc.nextInt();
			switch (count) {
			case 1:
				empService.add("reg101", "reg address", 123, "REG");
				empService.add("ret102", "ret address", 789, "RET");
				break;
			case 2:
				empService.displayAll();
				break;
			case 3:
				System.out.println("enter id");
				id = sc.nextInt();
				empService.delete(id);
				break;
			case 4:
				 System.out.println("enter id");
		        id = sc.nextInt();
		        System.out.println("enter name");
		        name = sc.next();
		        System.out.println("enter address");
		        address = sc.next();
		        empService.update(id,name,address);
				break;
			default:
				System.exit(0);
			}
		}

//        try {
//            //add one regular employee
//            empService.add("reg101", "reg address", 123, "REG");            
//        }catch(EmployeeException | IOException ee) {
//            System.err.println(ee.getLocalizedMessage());
//        }
//        
//        try {
//            //add one retired employee
//            empService.add("ret102", "ret address", 789, "RET");            
//        }catch(EmployeeException | IOException ee) {
//            System.err.println(ee.getLocalizedMessage());
//        }

//		try {
//			empService.displayAll();
//		} catch (EmployeeException | IOException ee) {
//			System.err.println(ee.getLocalizedMessage());
//		}
//
//		System.out.println("enter id");
//		id = sc.nextInt();
//		empService.delete(id);

//        System.out.println("enter id");
//        id = sc.nextInt();
//        System.out.println("enter name");
//        name = sc.next();
//        System.out.println("enter address");
//        address = sc.next();
//        empService.update(id,name,address);

		sc.close();

	}
}
