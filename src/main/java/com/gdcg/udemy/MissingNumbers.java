package com.gdcg.udemy;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumbers {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 6, 7, 8 };

        findMissingNumbers(arr);

    }

    // Function to find the missing numbers
    public static void findMissingNumbers(int[] arr) {

        // Sort the array(this is optional, depending on the given input)
        Arrays.sort(arr);

        // Find the first and the last element in the range
        int first = arr[0];
        int last = arr[arr.length - 1];

        // Initialize an arraylist to hold the missing numbers
        ArrayList<Integer> missingNumbers = new ArrayList<>();

        // Check for numbers in the range from first to last. Iterate from first to last
        // and check if each number is present in array.
        for (int i = first; i <= last; i++) {
            if (!contains(arr, i)) {
                missingNumbers.add(i);
            }
        }

        // Print the missing numbers
        if (missingNumbers.size() > 0) {
            System.out.println("Missing numbers: " + missingNumbers);
        } else {
            System.out.println("No missing numbers found!");
        }

    }

    // Helper function to check if an array contains a specific number
    public static boolean contains(int[] arr, int num) {

        for (int i : arr) {
            if (i == num) {
                return true;
            }
        }

        return false;

    }

}
