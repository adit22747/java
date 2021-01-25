package com.assignment1;

import java.util.ArrayList;
import java.util.List;

public class Sorted {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(103,"dm101",36,123));
		list.add(new Employee(102,"dm102",37,12300));
		list.add(new Employee(101,"dm103",26,2222));
		list.add(new Employee(104,"dm104",24,4000));
		list.add(new Employee(105,"dm105",22,6000));
		
		
		list
		.stream()
		.sorted((e1,e2) -> e1.getId() - e2.getId())
		.forEach((e) -> System.out.println(e)
		);
	}
}
