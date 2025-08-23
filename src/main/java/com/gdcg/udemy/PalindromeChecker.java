package com.gdcg.udemy;

public class PalindromeChecker {

    public static void main(String[] args) {

        // Define the string we want to check
        String original = "racecar";

        // Chack if the String is a palindrome
        if (isPalindrome(original)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {

        // Normalize the string by removing spaces and converting to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase(); // Madam should be equal to madam

        // Initialize two pointers here: one from the beginning and one from the end
        int left = 0;
        int right = str.length() - 1;

        // Compare characters while moving both pointers towards the center
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++; // Move the left pointer to right
            right--; // Move the right pointer to left
        }
        return true; // If all the characters matched, it is a palindrome

    }

}
