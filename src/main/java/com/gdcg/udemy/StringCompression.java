package com.gdcg.udemy;

public class StringCompression {

    public static void main(String[] args) {

        // "aaabbccccdd" its compressed form will be "a3b2c4d2"
        // Sample String input for compression
        String input = "aaabbccccdd";
        String compressedString = compressString(input);

        // Print the original and compressed String
        System.out.println("Original String: " + input);
        System.out.println("Compressed Strinng: " + compressedString);

    }

    // Methos to perform String compression
    public static String compressString(String input) {

        // Step 1: Check if the input is empty or null
        if (input == null || input.isEmpty()) {
            return input;
        }

        // Step 2: Use a StringBuilder to build the compressed String
        StringBuilder compressed = new StringBuilder();

        // Step 3: Start iterating through the String
        int count = 1;

        for (int i = 1; i < input.length(); i++) {

            // Check if the current character is the same as previous character
            if (input.charAt(i) == input.charAt(i - 1)) {

                count++; // If yes, increment the count
            } else {

                // If characters are different, append the previous character ans its count to
                // the result
                compressed.append(input.charAt(i - 1));
                compressed.append(count);
                count = 1; // Reset the count for the new character

            }
        }

        // Append the last character and its count
        compressed.append(input.charAt(input.length() - 1));
        compressed.append(count);

        // Step 4: Return the compressed String
        return compressed.length() < input.length() ? compressed.toString() : input;

    }

}
