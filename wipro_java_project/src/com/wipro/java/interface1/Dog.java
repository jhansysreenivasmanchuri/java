package com.wipro.java.interface1;

public class Dog implements Animal{

	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Bark");
	}
	public static void main(String a[]) {
		// TODO Auto-generated method stub
		Animal dog1 = new Dog();
		dog1.makeSound();
	}

}
