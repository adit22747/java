package com.cybage;

//v1.1 of application


@MyAnnotation(address="pune")
public class AnnotationExample {
	
	@MyAnnotation(address="pune")
	private int prop;
	
	@MyAnnotation(address="pune")
	public AnnotationExample(){
		System.out.println("this is constructor");
	}
	
	public static void main(@MyAnnotation String[] args) {
		
		@SuppressWarnings("unused")
		@MyAnnotation
		int a =123;
		
		
//		display();
//		newdisplay();
	}
	
	
//	@Deprecated
//	public static void display() {
//		System.out.println("displpay from version 1");
//		
//	}
//	
//	public static void newdisplay() {
//		System.out.println("displpay from version 2");
//		
//	}

}
