package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Rate implements Comparator<Movie1>{

public int compare(Movie1 m1, Movie1 m2) {
		
		//Sort by name in alphabetical order
		return m1.getN().compareTo(m2.getN());
	}
	
	public static void main(String[] args) {
		
		//Create a list of movies
		ArrayList<Movie1> m1 = new ArrayList<>();
		m1.add(new Movie1("Force Awakens", 8.5, 2015));
		m1.add(new Movie1("Star wars", 8.7, 1977));
		m1.add(new Movie1("Empire Strikes Back", 8.8, 1980));
		
		//Sort Movies by name and Display them all
		Collections.sort(m1,new Name());
		System.out.println("\n Movies Sorted by Rating");
		for(Movie1 m : m1) {
			System.out.println(m.getR()+" "+m.getN()+" "+m.getY());
		}
	}

}
