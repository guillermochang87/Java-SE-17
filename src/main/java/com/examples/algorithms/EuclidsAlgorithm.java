package com.examples.algorithms;

public class EuclidsAlgorithm {
    public static void main(String[] args) {

        int a = 9;
        int b = 3;

        System.out.println(" The Euclid's Algorithm of " + a + " and " + b + " is : " + gcd(a, b));

    }

    public static int gcd(int p, int q) {
        if (q == 0)
            return p;
        int r = p % q;
        return gcd(q, r);
    }

}
