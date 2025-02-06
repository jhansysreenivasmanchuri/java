package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnimalAge implements Comparator<Animal1>{

	public int compare(Animal1 a1, Animal1 a2) {
		
		//Sort by Age
		return Integer.compare(a1.getAge(), a2.getAge());
	}
	
	public static void main(String[] args) {
		
		//Create a list of Animals
		ArrayList<Animal1> l = new ArrayList<>();
		l.add(new Animal1("Lion", 38));
		l.add(new Animal1("Tiger", 25));
		l.add(new Animal1("Bear", 40));
		
		//Sort Movies by name and Display them all
		Collections.sort(l,new AnimalAge());
		System.out.println("\n Animals Sorted by Name");
		for(Animal1 a : l) {
			System.out.println(a.getName()+" "+a.getAge());
		}
	}

}
