/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
public class ExceptionExample {

	public static void main(String a[]) {
		int num1=10,num2=20,num3=0,data;
		try {
			data = (num1*num2)/num3;
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("I am always Executed");
		}
		System.out.println("Rest of the code");
	}
	public ExceptionExample() {
		// TODO Auto-generated constructor stub
	}

}
