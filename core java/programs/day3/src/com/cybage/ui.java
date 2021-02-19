package com.cybage;

import java.util.Scanner;

public class ui {
	public static void main(String[] args) {
		System.out.println("exception");
		
		//System.in --> standard input, keyboard
		//System.out --> standard output, monitor
		//System.err --> standard error, monitor
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter numbers");
		int n1 = scanner.nextInt();
		int n2=  scanner.nextInt();
		
		try{           //runtime problem may occur
			int div = n1/n2;
			System.out.println("division is"+ div);
			
		}catch(ArithmeticException ae){      //corrective action
			System.err.println("can not divide by zero");     //for end users
			System.err.println(ae.getMessage());       //for developers
		}finally{
			System.out.println("this block executed irrespective of exception");
			System.out.println("generally useful for resource management");
			scanner.close();
		}
		
		System.out.println("program completed");
	}

}
