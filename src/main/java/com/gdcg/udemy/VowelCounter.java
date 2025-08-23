package com.gdcg.udemy;

import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a String
        System.out.println("Enter a String to count the vowels: ");

        // Read the input String
        String inputString = scanner.nextLine();

        // Call the method to count vowels
        int vowelCount = countVowels(inputString);

        // Display the result
        System.out.println("The number of vowels in the String is: " + vowelCount);

    }

    // Method to count vowels in a give String
    public static int countVowels(String str) {

        // Initialize a counter variable to track the number of vowels
        int count = 0;

        // Convert the input String to lowercase to make comparison case-insensitive
        str = str.toLowerCase();

        // Loop through ech character in the String
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // Get the current character

            // Check if the character is a vowel(a,e,i,o,u)
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;

    }

}
