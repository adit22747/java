package com.assignment1;

import java.util.Scanner;

public class multipleCatch {
	public static void main(String[] args) {
		System.out.println("enter number divisible by 99");
		Scanner scn = new Scanner(System.in); 
        try
        { 
            int n = Integer.parseInt(scn.nextLine()); 
            if (99%n == 0) 
                System.out.println(n + " is a factor of 99"); 
        } 
        catch (NumberFormatException | ArithmeticException ex) 
        { 
            System.err.println("Exception encountered " + ex.getMessage()); 
        }
        finally {
			scn.close();
		}
	}
}

