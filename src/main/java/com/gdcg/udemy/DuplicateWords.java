package com.gdcg.udemy;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {

    public static void main(String[] args) {

        String input = "Java is a programming language. Java is also a platform";
        findDuplicateWords(input);

    }

    // Method to find and print duplicate words in a String
    public static void findDuplicateWords(String input) {

        // Convert the String to lowercase to make the comparison case-sensitive
        input = input.toLowerCase();

        // Use regualr expression to split the string into words
        String[] words = input.split("[\\W_]+");

        // Create a HashMap to store the count of each word
        Map<String, Integer> wordCount = new HashMap<>();

        // Loop through the array of words and populate the HashMap with word counts
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Print words that have count greater that 1(duplicates)
        boolean hasDuplicates = false;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate word: " + entry.getKey() + " (appears " + entry.getValue() + " times)");
                hasDuplicates = true;
            }
        }

        // If no duplicates were found
        if (!hasDuplicates) {
            System.out.println("No duplicates were found");
        }
    }

}
