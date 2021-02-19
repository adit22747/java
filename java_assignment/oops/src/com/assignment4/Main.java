package com.assignment4;

class Polygon {
	   public void display() {
	      System.out.println("Inside the Polygon class");
	   }
	}

	class AnonymousDemo {
	   public void createClass() {

	      
	      Polygon p1 = new Polygon() {
	         public void display() {
	            System.out.println("Inside an anonymous class.");
	         }
	      };
	      p1.display();
	   }
	}

	class Main {
	   public static void main(String[] args) {
	       AnonymousDemo an = new AnonymousDemo();
	       an.createClass();
	   }
	}
