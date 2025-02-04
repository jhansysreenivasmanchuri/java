package com.wipro.java.interface1;

public class Cow implements Animal{

	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Humbaa");
	}
	public static void main(String a[]) {
		Animal cow1 = new Cow();
		cow1.makeSound();
	}

}
