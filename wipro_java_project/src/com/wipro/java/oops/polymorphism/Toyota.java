/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Toyota extends Cars{
	
	
	public void Cardetails() {
		System.out.println("It's " + getModel() +", "+ getYear()+ ". " + " colour: " + getColor());
		
	}
	/**
	 * 
	 */
	public Toyota() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		Cars toyota = new Toyota();
		toyota.setModel("Etios");
		toyota.setColor("Black");
		toyota.setYear(2010);
		
		toyota.Cardetails();
	}

}
