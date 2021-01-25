package com.cybage;
//import java.lang.*;
import java.util.Arrays;
public class demo {
	//main method called by JVM,if JVM want to pass arguments
	public static void main(String args[]) {
//		System.out.println("hello world");
//		String name = "adit";
//		int empid = 1234;
//		float per = 66.66F;
//		double gdp = 326_7452_346_861_23D;
//		long population = 2364246876482622374L;
//		char gender = 'M';
//		boolean status = true;
		
//		System.out.println("name:"+name+per);
//		System.out.println(empid+population);
//		System.out.println("gdp:"+ gdp);
//		System.out.println("gender"+gender);
//		System.out.println("status:"+status);
		
		String hobbies[]=new String[4];
		hobbies[0]="us";
		hobbies[1]="can";
		hobbies[2]="ind";
		hobbies[3]="aus";
		
		for (String string : hobbies) {
			System.out.println(string);
		}
		
		
		String skills[] = {"java","spring","angular"};
		for (int i = 0; i < skills.length; i++) { //external iterations
			System.out.println(skills[i]);
		}
		
		int score[] = {20,10,30,40};
		
		for (int value : score) { //internal iterations
			System.out.println(value);
		}
		
		Arrays.sort(score);
		for (int value : score) { //internal iterations
			System.out.println(value);
		}
		
		int position=Arrays.binarySearch(score,40);
		System.out.println(position);
		
		int copyofscore[]=Arrays.copyOf(score,2); //to copy from 2 position
		int copyofscore1[]=Arrays.copyOf(score,score.length); //to copy all elements
		int copy1[] = Arrays.copyOfRange(score, 2, 3); // to copy a range
		}
	}


