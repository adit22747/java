package com.assignment3;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<Integer,Book> map = new HashMap<>();
		
		map.put(1,new Book("hello", 1));
		map.put(2,new Book("world", 2));
		map.put(3,new Book("world", 3));
		map.put(4,new Book("world", 4));
		map.put(5,new Book("world", 5));
		map.put(6,new Book("world", 6));
		
		for (Map.Entry<Integer,Book> entry : map.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
	}
}
