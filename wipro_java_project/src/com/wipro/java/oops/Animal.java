/**
 * 
 */
package com.wipro.java.oops;

/**No constructor
 * Getters have return value
 * setters have no return value
 * properties are determined using private fields
 * values or behaviors are determined through setters
 * toString returns will convert the entire animal class with properties and behaviors
 */
public class Animal {
	// Private Properties = Structure
	private String animalName;// Animal Name
	private String animalSpecies;// To which species animal belongs to
	private int animalCount;// No of Countable Animals
	/**
	 * @return the animalName
	 */
	public String getAnimalName() {
		return animalName;
	}

	/**
	 * @param animalName the animalName to set
	 */
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	/**
	 * @return the animalSpecies
	 */
	public String getAnimalSpecies() {
		return animalSpecies;
	}

	/**
	 * @param animalSpecies the animalSpecies to set
	 */
	public void setAnimalSpecies(String animalSpecies) {
		this.animalSpecies = animalSpecies;
	}

	/**
	 * @return the animalCount
	 */
	public int getAnimalCount() {
		return animalCount;
	}

	/**
	 * @param animalCount the animalCount to set
	 */
	public void setAnimalCount(int animalCount) {
		this.animalCount = animalCount;
	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public String toString() {
		return "Animal{" +
				"animalName='" + animalName + '\'' +
				", animalSpecies='" + animalSpecies + '\'' +
				", animalCount=" + animalCount +
				'}';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
