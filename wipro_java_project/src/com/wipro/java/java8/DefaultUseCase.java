package com.wipro.java.java8;

interface TestInterface3{
	
	//Default Method
	default void show() {
		System.out.println("Default TestInterface 3");
	}
}
interface TestInterface4{
	
	//Default Method
	default void show() {
		System.out.println("Default TestInterface 4");
	}
}
public class DefaultUseCase implements TestInterface3,TestInterface4 {
	
	public void show() {
		// TODO Auto-generated method stub
		TestInterface3.super.show();
		TestInterface4.super.show();

	}
	public static void main(String[] args) {
		DefaultUseCase d = new DefaultUseCase();
		d.show();
	}
	

}
