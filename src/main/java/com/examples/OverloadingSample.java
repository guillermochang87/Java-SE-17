package com.examples;

public class OverloadingSample {

    /*
     * Method Overloading
     * 
     * Occurs within the same class when multiple methods have the same name but
     * different parameters (type, number, or order).
     * 
     * Key Points:
     * Happens at compile-time (also called compile-time polymorphism).
     * Return type can be different, but it alone doesn't distinguish overloaded
     * methods.
     * Improves code readability and flexibility.
     * 
     */

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println("The result of adding integers numbers are: " + add(3, 4));
        System.out.println("The result of adding two doubles numbers are: " + add(3.5, 4.3));
        System.out.println("The result of adding three integers numebers are: " + add(3, 4, 6));

    }

}
