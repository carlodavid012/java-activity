package com.ayannah.artifact;

//overriding
class Animal {
	   public void move() {
	      System.out.println("Animals can move");
	   }
	}

	class Dog extends Animal {
	   public void move() {
	      System.out.println("Dogs can walk");
	   }
	}

	public class TestDog {

	   public static void main(String args[]) {
	      Animal a = new Animal();   
	      Animal b = new Dog();  

	      a.move();  
	      b.move();   
	   }
	}
