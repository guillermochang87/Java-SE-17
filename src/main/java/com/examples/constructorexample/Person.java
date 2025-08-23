package com.examples.constructorexample;

public class Person {
    String name;
    int age;

    public Person() {
        this.name = "Unknow";
        this.age = 0;
    }

    // Constructor with one parameter
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with two parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
