package com.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sorted {
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(103,"dm101",36,123));
		list.add(new Employee(102,"dm102",37,12300));
		list.add(new Employee(101,"dm103",26,2222));
		list.add(new Employee(104,"dm104",24,4000));
		list.add(new Employee(105,"dm105",22,6000));
		
		
		list
		.stream()
		.sorted((e1,e2) -> e1.getName().compareTo(e2.getName()))
		.forEach((e) -> System.out.println(e)
		);
		
		System.out.println("enter name");
		name=sc.nextLine();
		
		try {
			for(Employee e : list) {
				if(e.getName().equalsIgnoreCase(name)) {
					throw new employeeExist("already exist");
				}
			}
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}finally {
			sc.close();
		}
	}
}