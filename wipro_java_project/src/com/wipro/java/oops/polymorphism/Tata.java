/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Tata extends Cars{
	
	public void Cardetails() {
		System.out.println("It's " + getModel() +", "+ getYear()+ ". " + " colour: " + getColor());
		
	}
	/**
	 * 
	 */
	public Tata() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		Cars tata = new Tata();
		tata.setModel("Manza");
		tata.setColor("White");
		tata.setYear(2009);
		
		tata.Cardetails();
	}


}
