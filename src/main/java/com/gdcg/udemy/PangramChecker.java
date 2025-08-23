package com.gdcg.udemy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {

    public static void main(String[] args) {

        // Initialize a Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a sentence
        System.out.println("Enter a sentence to check if it is a Pangram: ");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("The sentence is a Pangram.");
        } else {
            System.out.println("The sentence is not a Pangram.");
        }

    }

    public static boolean isPangram(String sentence) {

        // Convert the sentence to lowercase to handle case insensitivity
        sentence = sentence.toLowerCase();

        // Set to hold the characters that we encounter
        Set<Character> encounteredCharacters = new HashSet<>();

        // Loop through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            // If the character is a letter (between 'a' and 'z'), add it to the set
            if (currentChar >= 'a' && currentChar <= 'z') {
                encounteredCharacters.add(currentChar);
            }
        }

        // If the set contains all 26 letters it is a Pangram
        return encounteredCharacters.size() == 26;

    }

}
