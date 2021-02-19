package com.cybage;

import java.util.Scanner;

public class ui1 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter age");
		int age =  scanner.nextInt();
		
		try{
			if(age>18){
				System.out.println("eligible");
			}
			else{
				throw new votingexception("your age is less than 18:");
			}
			
		}catch(votingexception ve){
			System.err.println(ve.getMessage());
		}finally{
			scanner.close();
		}
		
	}
}
