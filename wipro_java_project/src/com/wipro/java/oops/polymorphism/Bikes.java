/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Bikes {
	
	private String brand;
	private int year;
	private String colour;
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}
	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	/**
	 * @return the colour
	 */
	
	@Override
	public String toString() {
		return "Bikes [brand=" + brand + ", year=" + year + ", colour=" + colour + "]";
	}
	/**
	 * 
	 */
	public Bikes() {
		// TODO Auto-generated constructor stub
	}
	public void BikeInfo() {
		System.out.println("It's a"+getBrand()+getYear()+"Model with "+getColour()+"colour");
		
	}

}
