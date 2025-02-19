package com.wipro.java.collection;

import java.util.TreeMap;
import java.util.Map;

public class FibonacciSeriesInTreeMap {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        TreeMap<Integer, Integer> fibonacciMap = new TreeMap<>();

        int a = 0, b = 1;

        // Storing Fibonacci sequence in TreeMap
        for (int i = 1; i <= n; i++) {
            fibonacciMap.put(i, a); // Store index as key, Fibonacci number as value
            int next = a + b;
            a = b;
            b = next;
        }

        // Printing the Fibonacci sequence from the TreeMap
        System.out.println("Fibonacci Series stored in TreeMap:");
        for (Map.Entry<Integer, Integer> entry : fibonacciMap.entrySet()) {
            System.out.println("Position " + entry.getKey() + " : " + entry.getValue());
        }
    }
}
