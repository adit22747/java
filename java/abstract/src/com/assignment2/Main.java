package com.assignment2;

class Shape{
	protected int length;
	protected int width;
	protected int radius;
	public Shape(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public Shape(int radius) {
		this.radius=radius;
	}

	public double area(){
		return 0;
	}
}

class traingle extends Shape {
	
	
	public traingle(int length, int width) {
		super(length, width);
	}

	public double area(){
		return (0.5*length*width);
	}
}

class rectangle extends Shape {
	
	
	public rectangle(int length, int width) {
		super(length, width);
	}

	public double area(){
		return (length*width);
	}
}

class circle extends Shape {
	
	
	public circle(int radius) {
		super(radius);
	}

	public double area(){
		return (3.14*radius*radius);
	}
}

public class Main{
	public static void main(String[] args) {
		Shape shp = new traingle(2, 3);
		System.out.println("area of triangle: "+shp.area());
		shp = new rectangle(2, 3);
		System.out.println("area of rectangle: "+shp.area());
		shp = new circle(4);
		System.out.println("area of circle: "+shp.area());
	}
}
