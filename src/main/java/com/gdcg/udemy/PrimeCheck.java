package com.gdcg.udemy;

import java.util.Scanner;

// A prime number is a natural number greater than 1 that cannot be formed by multiplying two smaller natural numbers. It has only two factors i.e 1 and itself
public class PrimeCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // num is divisible by i, hence not prime
            }
        }
        return true;
    }

}
