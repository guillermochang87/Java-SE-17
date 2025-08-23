package com.gdcg.udemy;

// 0, 1, 1, 2, 3 ,5 ,8
public class FibonacciSeries {

	public static void main(String[] args) {
		// Defining the number of Fibonacci numbers we want to generate
		int n = 10;

		// Initializing the first two Fibonacci numbers
		int first = 0, second = 1;

		// Print the Fibonacci sequence
		System.out.println("Fibonacci series up to " + " :");

		// The loop will iterate n times to generate Fibonacci numbers. In each
		// iteration, the next Fibonacci number is computed by adding the last two
		for (int i = 1; i <= n; i++) {

			// Print the Fibonacci number (starting with 0, then 1, etc.)
			System.out.println(first + " ");

			// Compute the next Fibonacci number by summing the last two numbers
			int next = first + second;

			// Move the window of the last two Fibonacci numbers forward.
			// First becomes the old second, and second becomes the next number.
			first = second;
			second = next;

		}
	}

}
