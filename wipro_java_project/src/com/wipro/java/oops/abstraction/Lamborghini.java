/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public class Lamborghini extends Car{
	
	/**
	 * 
	 */
	public Lamborghini() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("Lamborghini has a top speed of 250 km/h.");
	}

	@Override
	public void mileage() {
		// TODO Auto-generated method stub
		System.out.println("Lamborghini provides a mileage of 12 km/l.");
	}
	public static void main(String a[]){
		Car myCar = new Lamborghini();
        myCar.speed();
        myCar.mileage();
	}

}
