/**
 * 
 */
package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class MapImplementation {

	public static void main(String a[]) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Banana");
		map.put(2, "Grapes");
		map.put(3, "Avacado");
		
		System.out.println("Key 1: " + map.get(1));
		System.out.println("Key 2: " + map.get(2));
		
		if (map.containsKey(3)) {
			System.out.println("Key 3 Exists With Value: " + map.get(3));
		}
		
		System.out.println("\n Iterating Through Map: ");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		map.remove(2);
		
		System.out.println("\n Map After Removal of Key 2: ");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
