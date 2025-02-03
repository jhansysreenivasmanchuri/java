/**
 * 
 */
package com.wipro.java.oops.encapsulation;

/**
 * 
 */
public class Animal {
	
	private String name;
	private String dietType;
	private float weight;
	/**
	 * @param name
	 * @param dietType
	 * @param weight
	 */
	public Animal(String name, String dietType, float weight) {
		super();
		this.name = name;
		this.dietType = dietType;
		this.weight = weight;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the dietType
	 */
	public String getDietType() {
		return dietType;
	}
	/**
	 * @param dietType the dietType to set
	 */
	public void setDietType(String dietType) {
		this.dietType = dietType;
	}
	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		if (weight<0){
			System.out.println("The Weight should be More then 0");
		}else{
			this.weight = weight;
		}
	}

	/**
	 * 
	 */
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		Animal animal = new Animal("Lion","Carnivore",150);
		System.out.println(animal.getName());
		System.out.println(animal.getDietType());
		System.out.println(animal.getWeight());
		
		animal.setName("Rabbit");
		animal.setDietType("Herbivore");
		animal.setWeight(5);
		System.out.println(animal.getName());
		System.out.println(animal.getDietType());
		System.out.println(animal.getWeight());
		
		animal.setWeight(-10);
		
	}

}
