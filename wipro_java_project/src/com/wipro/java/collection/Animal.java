package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Animal implements Comparable<Animal>{
		
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public int compareTo(Animal a) {
		// TODO Auto-generated method stub
		return this.age - a.age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	public static void main(String[] args) {
		ArrayList<Animal> l = new ArrayList<>();
		l.add(new Animal("Lion", 38));
		l.add(new Animal("Tiger", 25));
		l.add(new Animal("Bear", 40));
		
		Collections.sort(l);
		
		System.out.println("Movies After Sorting by Age");
		for (Animal m : l) {
			System.out.println(m.getName() +" "+m.getAge());
		}
		
	}
	

}
