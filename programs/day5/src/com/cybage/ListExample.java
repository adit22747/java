package com.cybage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<String> skills = new ArrayList<String>();
		
		skills.add("java");
		skills.add("angular");
		skills.add(0, "spring");
		skills.add("spring");
		
		System.out.println(skills);
		
		for (String string : skills) {
			System.out.println(string);
		}
		
//		Iterator<String> skill = skills.iterator();
//		while (skill.hasNext()) {
//			String string = (String) skill.next();
//			System.out.println(string);
//		}
		
		skills.remove(1);
		System.out.println(skills);
		
		skills.remove("spring");
		System.out.println(skills);
		
		//Searching
		System.out.println("search using:" + skills.get(1));
		
		//Searching using object
		System.out.println("search using:" + skills.contains("spring"));
		
		//Searching using object get index
		System.out.println("search using index:" + skills.indexOf("spring"));
		
		//sorting
		Collections.sort(skills);
		System.out.println("ascending:"+skills);
		
		Collections.sort(skills,Collections.reverseOrder());
		System.out.println("descending:"+skills);
		
		
	}
}
