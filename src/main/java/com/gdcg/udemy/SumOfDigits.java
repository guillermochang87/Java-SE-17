package com.gdcg.udemy;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("Enter a number: ");

        // Read the number entered by the user // 324
        int number = scanner.nextInt();

        // Variable to store the sum of digits
        int sum = 0;

        while (number != 0) {
            sum += number % 10; // Get the las digit of the number using modulus operator // : 4 : 4 + 2 = 6 : 6
                                // + 3 = 9
            number = number / 10; // Remove the last digit by dividing the number by 10 // : 32 : 3 : 0
        }

        // Output the sum of the digits
        System.out.println("Sum of digits: " + sum);

        // Close the scanner object to prevent resource leak
        scanner.close();

    }

}
