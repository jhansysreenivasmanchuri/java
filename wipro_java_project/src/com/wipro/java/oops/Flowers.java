/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Flowers {

	//properties and behaviors
	// rose, blue
	// sun flower, yellow
	
	//member variables
	String flowerName;
	String flowerColor;
	String flowerSize;
	
	//constructor
	Flowers(String flowerName, String flowerColor, String flowerSize){
		this.flowerName = flowerName;
		this.flowerColor = flowerColor;
		this.flowerSize = flowerSize;
	}
	void display() {
		System.out.println("Flower Name :" + flowerName + " | Flower Color:"+ flowerColor + " | Flower Size:"+ flowerSize);
	}
	public static void main(String args[]) {
		Flowers flowerobject1 = new Flowers("rose", "blue", "small");
		Flowers flowerobject2 = new Flowers("sunflower", "yellow", "large");
		flowerobject1.display();
		flowerobject2.display();
	}

}
