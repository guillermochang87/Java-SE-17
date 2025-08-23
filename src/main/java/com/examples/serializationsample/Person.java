package com.examples.serializationsample;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for version control

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name ='" + name + "', age =" + age + "}";
    }
}
