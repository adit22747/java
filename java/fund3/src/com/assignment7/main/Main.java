package com.assignment7.main;

import com.assignment7.p1.p1;

public class Main {
	public static void main(String[] args) {
		p1 p = new p1();
		p.display();
		
		//cannot use the display method of package p2
		//p2 p = new p2();
		// as p2 is not inherited
	}
}	
