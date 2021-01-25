package com.cybage;

 

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

 

public class SetExample {
    public static void main(String[] args) {
        System.out.println("set example...");
       // Set<String> skills = new HashSet<>();
       // Set<String> skills = new LinkedHashSet<>();
      //  Set<String> skills = new TreeSet<>();
        Set<String> skills = new TreeSet<>(Collections.reverseOrder());
        //java, angular, java
        skills.add("java");
        skills.add("angular");
        skills.add("react");
        skills.add("aws");
        skills.add("angular");
        skills.add("react");
        skills.add("aws");
        
        System.out.println(skills);
        
//        for(String s: skills) {
//            System.out.println(s);
//        }
//        //using iterator
//        Iterator<String> sit = skills.iterator();
//        while(sit.hasNext()) {
//            System.out.println(sit.next());
//        }
        
        //using iterator
//        Iterator<String> sit = skills.iterator();
//        while(sit.hasNext()) {
//        
//        	if(sit.next().equals("angular")){
//        		sit.remove();
//        	}
//            System.out.println(sit.next());
//        }
        
        
    }
}