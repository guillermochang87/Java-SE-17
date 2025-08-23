package com.examples;

public class InterpolationJava {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 25;

        // String message = STR."My name is \{name} and I am \{age} years old.";
        String message = String.format("%s is %d years old.", name, age);
        System.out.println(message);

    }

}
