/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Kawasaki extends Bikes{
	
	public void BikeInfo() {
		System.out.println("It's a Kawasaki "+getBrand()+" "+getYear()+" "+"Model with "+getColour()+" colour");
		
	}
	/**
	 * 
	 */
	public Kawasaki() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		Bikes kawasaki = new Kawasaki();
		kawasaki.setBrand("Ninja");
		kawasaki.setColour("Grey");
		kawasaki.setYear(2015);
		
		kawasaki.BikeInfo();
	}

}
