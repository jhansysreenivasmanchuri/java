/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * Parent Class = Cars
 * child class = LuxuryCars
 * extends is a keyword for inheritance
 */
public class LuxuryCars extends Cars{

	/**
	 * 
	 */
	public LuxuryCars() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		
		LuxuryCars luxurycars= new LuxuryCars();
		luxurycars.setCarNum(123);
		luxurycars.setCarModel("S Class");
		luxurycars.setCarBrand("Benz");
		luxurycars.setPrice(1200000);
		
	}

}
