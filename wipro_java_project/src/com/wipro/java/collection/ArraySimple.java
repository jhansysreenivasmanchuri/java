/**
 * 
 */
package com.wipro.java.collection;

/**
 * 
 */
public class ArraySimple {

	public static void main (String a[]) {
		int[] arr;
		
		arr = new int[6];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		
		for (int i = 0; i < arr.length; i++){
			System.out.println("The index of number is "+ i +" And the Number is "+arr[i]);
		}
	}
	public ArraySimple() {
		// TODO Auto-generated constructor stub
	}

}
