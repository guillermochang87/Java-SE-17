package com.examples.trycatchexamples;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExample {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("file.txt"); // Might not exist
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

}
