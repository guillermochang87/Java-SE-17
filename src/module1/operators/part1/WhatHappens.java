package module1.operators.part1;

public class WhatHappens {

    public static void main(String[] args) {

        int a = 99;
        int b = 99;
        // int c = 99;

        System.out.println(++a);
        System.out.println(b++);
        // System.out.println(++c++); // This doesn't compile, the second ++ it doesn't work because there is not L value
        
    }

}
