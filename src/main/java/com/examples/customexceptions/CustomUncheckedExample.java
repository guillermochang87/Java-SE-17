package com.examples.customexceptions;

public class CustomUncheckedExample {
    static void squareToot(int num) {
        if (num < 0) {
            throw new NegativeNumberException("Number must be non-negative.");
        }
        System.out.println(Math.sqrt(num));
    }

    public static void main(String[] args) {
        squareToot(-5); // Throws unchecked exception
    }

}
