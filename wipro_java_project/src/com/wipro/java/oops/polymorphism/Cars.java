/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Cars {
	private String model;
	private int year;
	private String color;
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
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
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Cars [model=" + model + ", year=" + year + ", color=" + color + "]";
	}

	/**
	 * 
	 */
	public Cars() {
		// TODO Auto-generated constructor stub
	}
	public void Cardetails() {
		System.out.println("It's Etios"+getModel()+getYear()+"colour"+getColor());
		
	}


}
