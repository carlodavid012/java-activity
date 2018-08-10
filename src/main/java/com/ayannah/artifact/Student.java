package com.ayannah.artifact;


public class Student extends Person{
	public Student() {
		this("Student");
		System.out.println("#2 ");
	}
	public Student(String n) {
		super(n);
		System.out.print("#3 ");
	}
	
}
