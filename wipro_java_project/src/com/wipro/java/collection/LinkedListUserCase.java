package com.wipro.java.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListUserCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Creating LinkedList
        List<Integer> ll = new LinkedList<>();

        // Getting user input
        System.out.print("Enter the number of elements: ");
        n = scanner.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            ll.add(scanner.nextInt());
        }

        // Printing elements
        System.out.println("Linked List: " + ll);

        scanner.close();
    }
}
