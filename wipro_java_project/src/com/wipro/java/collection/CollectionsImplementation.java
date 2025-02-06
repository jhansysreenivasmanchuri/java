/**
 * 
 */
package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 
 */
public class CollectionsImplementation {

	public static void main (String a[]) {
		//Initializations
		int[] arr;
		int n;
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> ll = new LinkedList<Integer>();
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//Array
		arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		for (int i = 0; i < arr.length; i++){
			System.out.println("The index of number is "+ i +" And the Number is "+arr[i]);
		}
		
		//List
		l1.add(0,2);
		l1.add(1,4);
		l1.add(2,6);
		System.out.println(l1);
		
		//LinkedList
		n = 5;
		for (int i = 1; i <= n; i++)
			ll.add(i);
		System.out.println(ll);
		
		//Map
		map.put(1, "Apple");
		map.put(2, "MuskMelon");
		map.put(3, "KiWi");
		
		System.out.println("Key 1: " + map.get(1));
		System.out.println("Key 2: " + map.get(2));
		
		//List Operations
		l1.addAll(3, l1);
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		l1.set(2, 12);
		System.out.println(l1);
		System.out.println(l1.get(2));
		
		//LinkedList Operations
		// Remove element at index 3
		ll.remove(3);// index
		 
		// Displaying the list after deletion
		System.out.println(ll);
		 
		// Printing elements one by one
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		
		//MapImplementation
		
		if (map.containsKey(3)) {
			System.out.println("\n This key is Already Available, Value: " + map.get(3));
		}
		
		System.out.println("\n Iterating Through Map: ");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		map.remove(1);
		
		System.out.println("\n Map After Removal of Key 1: ");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
		
	}

}
