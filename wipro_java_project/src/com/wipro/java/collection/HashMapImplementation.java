package com.wipro.java.collection;

import java.util.HashMap;

public class HashMapImplementation {
  public static void main(String[] args) {

    // create a hashmap
	//hashMap creation with 8 capacity and 0.6 load factor
    HashMap<String, Integer> languages = new HashMap<>();
    
    // add elements to hashmap
    languages.put("Java", 8);
    languages.put("JavaScript", 1);
    languages.put("Python", 3);
    System.out.println("HashMap: " + languages);
  }
}


