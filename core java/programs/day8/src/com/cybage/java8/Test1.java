package com.cybage.java8;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Comparator;

@SuppressWarnings("unused")
public class Test1 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101,"dm101",36,123));
		list.add(new Employee(102,"dm102",37,12300));
		list.add(new Employee(103,"dm103",26,2222));
		list.add(new Employee(104,"dm104",24,4000));
		list.add(new Employee(105,"dm105",22,6000));
		
//		list
//		.stream()			//it will return stream , it is a temporary work area
//		.forEach((e) -> System.out.println(e)
//		);
		
		
		
//		for (Employee employee : list) {		both above one and foreach are same
//			System.out.println(employee);
//		}
		
		
		
//		list
//		.parallelStream()
//		.map(e -> e.getName().toUpperCase())
//		.forEach((e) -> System.out.println(e)
//		);
		
		
		
//		list
//		.parallelStream()
//		.map(e -> {e.setName(e.getName().toUpperCase()); return e; })
//		.forEach((e) -> System.out.println(e)
//		);
		
		
		
//		list
//		.stream()
//		.sorted(new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return o1.getAge()-o2.getAge();
//			}
//		})
//		.forEach((e) -> System.out.println(e)
//		);
		
		
		
//		list
//		.stream()
//		.sorted((e1,e2) -> e1.getAge() - e2.getAge())
//		.forEach((e) -> System.out.println(e)
//		);
//		
		
		
//		list
//		.stream()
//		.skip(1)
//		.sorted((e1,e2) -> e1.getAge() - e2.getAge())
//		.forEach((e) -> System.out.println(e)
//		);
		
		
		
//		list
//		.stream()
//		.limit(3)
//		.sorted((e1,e2) -> e1.getAge() - e2.getAge())
//		.forEach((e) -> System.out.println(e)
//		);
		
		
		
//		list
//		.stream()
//		.filter(e -> e.getAge() > 30 )
//		.forEach((e) -> System.out.println(e)
//		);
		
		
		
		
		long cnt = list
		.stream()
		.filter(e -> e.getAge() < 30 )
		.count();
		System.out.println("no of emp bwlo 30: " + cnt);
		
	}
}
