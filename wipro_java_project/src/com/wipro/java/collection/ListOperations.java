/**
 * 
 */
package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class ListOperations {
	
	public static void main(String a[]) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(0, 5);
		l1.add(1, 10);
		l1.add(2, 15);
		
		System.out.println(l1);
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(3);
		l2.add(6);
		l2.add(9);
		
		System.out.println(l2);
		
		l1.addAll(1, l2);
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		l2.set(2, 12);
		System.out.println(l2);
		System.out.println(l2.get(2));
	}
	
	

}
