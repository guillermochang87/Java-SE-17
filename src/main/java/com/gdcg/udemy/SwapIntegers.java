package com.gdcg.udemy;

public class SwapIntegers {
	public static void main(String[] args) {

		int a = 3;
		int b = 5;

		// Print the initial values
		System.out.println("Before swapping a = " + a + ", b = " + b);

		// Calling the method to swap
		swapUsingAdditionSubtraction(a, b);

	}

	// Method to swap two integers using addition and subtraction
	public static void swapUsingAdditionSubtraction(int a, int b) {

		// Step 1: Add both a and b and will store the result in a
		a = a + b;

		// Step 2: Subtract the new value of a by b to get the original value of a
		b = a - b;

		// Step 3: Subtract the new value of b (Which was originally a) from a to get
		// the original value of b
		a = a - b;

		// Display these swapped values
		System.out.println("After swapping a = " + a + ", b = " + b);

	}

	/*
	 * Example walk-through
	 * 
	 * Step 1 : a = 5 + 3 = 8 (Now the value of a became 8)
	 * 
	 * Step 2: b = 8 - 3 = 5 (Now b is 5, which was the original value of a)
	 * 
	 * Step 3: a = 8 - 5 = 3 (Now a is 3, which was the original value of b)
	 * 
	 * So after the swap : a = 3, b = 5
	 * 
	 */

}
