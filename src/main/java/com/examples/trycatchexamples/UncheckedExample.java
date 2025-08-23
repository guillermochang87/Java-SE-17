package com.examples.trycatchexamples;

public class UncheckedExample {

    public static void main(String[] args) {
        String s = null;
        System.out.println(s.length()); // Throws NullPointerException
    }

}
