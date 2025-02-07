package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnimalName implements Comparator<Animal1>{

	public int compare(Animal1 a1, Animal1 a2) {
			
			//Sort by name in alphabetical order
			return a1.getName().compareTo(a2.getName());
		}
		
		public static void main(String[] args) {
			
			//Create a list of Animals
			ArrayList<Animal1> l = new ArrayList<>();
			l.add(new Animal1("Lion", 38));
			l.add(new Animal1("Tiger", 25));
			l.add(new Animal1("Bear", 40));
			
			//Sort Movies by name and Display them all
			Collections.sort(l,new AnimalName());
			System.out.println("\n Animals Sorted by Name");
			for(Animal1 n : l) {
				System.out.println(n.getName()+" "+n.getAge());
			}
		}

	
}
