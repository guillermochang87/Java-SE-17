package com.gdcg.udemy;

import java.util.Arrays;

public class SortNames {

    public static void main(String[] args) {

        // Create an array of names
        String[] names = { "Zara", "John", "Alice", "Bob", "Eve" };

        // Print out the original names
        System.out.println("Original names: ");
        for (String name : names) {
            System.out.println(name + " ");
        }
        System.out.println(); // To create a space between original and sorted list

        // Sort the array of names
        Arrays.sort(names);

        System.out.println("Sorted names: ");
        for (String name : names) {
            System.out.println(name + " ");
        }
    }

}
