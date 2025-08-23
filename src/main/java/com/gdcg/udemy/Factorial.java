package com.gdcg.udemy;

public class Factorial {
    public static void main(String[] args) {

        // n! = n * (n-1) * (n-2) * ... 1
        // 5! = 5*4*3*2*1 = 120
        // 3! = 3*2*1 = 6
        // 0! = 1

        int number = 5;
        System.out.println("The factorial of " + number + " is: " + factorialIterative(number));
    }

    public static long factorialIterative(int n) {

        // Handling base case: If n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }

        // Initialize the result variable to 1
        long result = 1;

        // Loop through all numbers from 2 to n and multiply to result
        for (int i = 2; i <= n; i++) {
            result *= i; // result = 1*2 = 2 // result = 2*3= 6 // result = 6*4 = 24 // result = 24 * 5 =
                         // 120
        }

        // Return the final result
        return result;
    }

}
