package com.gdcg.udemy;

import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {

        // First we create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // now lets ask the user to input three numbers
        System.out.println("Enter First Number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter Third Number: ");
        int num3 = scanner.nextInt();

        // We will use an if-else block to figure out which number is the largest
        int largest;

        // Lets check if num1 is the largest, if it is the largest then great, we set it
        // as the largest
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        }
        // If num1 is not the largest, we check if num2 is
        else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        }
        // Otherwise, if neither num1 or num2 is the largest, it must be num3
        else {
            largest = num3;
        }

        // And here we put the largest number
        System.out.println("The largest number is: " + largest);

        scanner.close();

    }

}
