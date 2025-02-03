/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public class Benz extends Car{
	@Override
    public void speed() {
        System.out.println("Benz has a top speed of 180 km/h.");
    }

    @Override
    public void mileage() {
        System.out.println("Benz provides a mileage of 15 km/l.");
    }
	/**
	 * 
	 */
	public Benz() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]){
		Car myCar = new Benz();
        myCar.speed();
        myCar.mileage();
	}

}
