package com.cybage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserExample {
	public static void main(String[] args) {
		System.out.println("user example");
		List<User> users = new ArrayList<User>();
		
		User u = new User(103,"sssadmin");
		
		users.add(new User(131,"admin"));
		users.add(new User(121,"dmin"));
		users.add(new User(1241,"dsdsdmin"));
		users.add(u);
		
		System.out.println(users);
		
//		users.remove(new User(103,"sssadmin"));
//		System.out.println("after removal:" + users);
		
		//users.remove(u);
		
//		Collections.sort(users);
//		System.out.println(users);
		
		 //sorting using id(asc)
        Collections.sort(users, new idComparator());
        System.out.println("after sorting" + users);
        
        //now i want to sorting using id but in desc
        Collections.sort(users, new IdComparatorDesc());
        System.out.println("after sorting" + users);
        
        //now want to sort using name(Asc)
        Collections.sort(users, new NameComparator());
        System.out.println("after sorting" + users);
		
	}
}
