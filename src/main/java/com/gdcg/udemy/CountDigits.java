package com.gdcg.udemy;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Asking the user to input a number
		System.out.println("Enter a number to count its digits:");
		int number = scanner.nextInt();

		// Calling the method to count digits
		int digitCount = countDigits(number);

		// Displaying the result
		System.out.println("The number " + number + " has " + digitCount + " digits.");

		scanner.close();

	}

	public static int countDigits(int number) {
		int count = 0; // Variable to store the number of digits
		while (number != 0) {// Loop will run as long as there are digits left
			number = number / 10; // remove the last digit of the number
			count++;
		}
		return count; // Return the final digit count
	}
}
