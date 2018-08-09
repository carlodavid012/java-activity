package com.ayannah.artifact;

//inheritance
class Calculation {
	
	public void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("The sum is " + sum);
	} 
	
	public void multiply(int num1, int num2) {
		int prod = num1 * num2;
		System.out.println("The product is " + prod);
	}
	
	public void subtract(int num1, int num2) {
		int diff = num1 * num2;
		System.out.println("The difference is " + diff);
	} 
}

public class MyCalculation extends Calculation{
	
	public static void main(String[] args) {
		int num1 = 4, num2 = 3;
		MyCalculation myCalculation = new MyCalculation();
		myCalculation.add(num1, num2);
	}
}
