package com.examples.constructorexample;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("Guillermo");
        Person person3 = new Person("Sofía", 4);

        System.out.println(person1.name + " " + person1.age);
        System.out.println(person2.name + " " + person2.age);
        System.out.println(person3.name + " " + person3.age);
    }

}
