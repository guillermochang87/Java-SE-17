package com.gdcg.udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterFrequenceSorter {

    public static void main(String[] args) {

        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scanner.nextLine();

        // Count the frequency of each character
        int[] frequency = new int[256];

        // Array to store frequency of each character (assuming ASCII characters)
        // Loop through each character in the input String
        for (int i = 0; i < input.length(); i++) {
            frequency[input.charAt(i)]++; // Increase the frequency of the character at position i
        }

        // Create a list of characters and their frequencies to store in order
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {

                // Only add characters that have appeared in the String
                characters.add((char) i);
            }
        }

        // Sort characters based on their frequency (use a simple sorting method)
        // Sort characters using Bubble sort
        for (int i = 0; i < characters.size(); i++) {
            for (int j = i + 1; j < characters.size(); j++) {
                if (frequency[characters.get(i)] > frequency[characters.get(i)]) {

                    // Swap if frequncy of characters[j] is greater than character[i]
                    char temp = characters.get(i);
                    characters.set(i, characters.get(j));
                    characters.set(j, temp);
                }
            }
        }

        // Print the results
        System.out.println("Characters sorted by frequency in descending order: ");
        for (char ch : characters) {
            System.out.println(ch + " : " + frequency[ch]);
        }

    }

}
