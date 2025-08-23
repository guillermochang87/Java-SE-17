package com.gdcg.udemy;

public class DigitEvenOddCount {

	public static void main(String[] args) {

		int evenCount = 0;
		int oddCount = 0;
		int num = 123456789;

		while (num != 0) {
			int digit = num % 10; // Extract the last digit : 9

			if (digit % 2 == 0) {
				evenCount++; // Increment even count
			} else {
				oddCount++; // Increment odd count
			}

			num = num / 10; // Remove the last digit : num = 12345678

		}

		System.out.println("Even Digits: " + evenCount);
		System.out.println("Odd Digits: " + oddCount);

	}

}
