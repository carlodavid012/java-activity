package com.ayannah.artifact;

public class Rectangle implements MyShape{
	
	static double length = 1;
	static double height = 2;
	public double width = 3;

	public double area() {
		return length * height;
	}

	public double volume() {
		return length * height * width;
		
	}

	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
	public static void print() {
		System.out.println("area is: " + length * height);
	}

}
