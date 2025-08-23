package com.gdcg.udemy;

public class ReverseInteger {
    public static void main(String[] args) {

        int number = 12345; // This is the number we want to reserve
        int reversedNumber = reverseInteger(number); // Call the method to reverse the number

        System.out.println("Original Number: " + number); // Output the original number
        System.out.println("Reversed Number " + reversedNumber); // Output the reversed number

    }

    // This method takes an integer as an argument and returns the reversed version
    // of it
    public static int reverseInteger(int num) {

        int reversed = 0; // Initialize a variable to store the reversed number
        while (num != 0) { // Continue looping until the number becomes 0
            int digit = num % 10; // Get the last digit of the number using modulus // : 5 : 4 : 3 : 2 : 1
            reversed = reversed * 10 + digit; // Build the reversed number // : 5 : 54: 543 : 5432 : 54321
            num = num / 10; // Remove ths last digit from the number by dividing it by 10 // : 1234 : 123 :
                            // 12 : 1
        }
        return reversed;
    }

}
