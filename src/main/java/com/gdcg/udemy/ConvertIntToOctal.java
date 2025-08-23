package com.gdcg.udemy;

import java.util.Scanner;

public class ConvertIntToOctal {
    public static void main(String[] args) {

        /*
         * // Scanner class we ue in java to read the input that the user will be going
         * to
         * // give via keyboard
         * // System.in is actually a parameter which we will be using to take input
         * from
         * // the user
         * Scanner sc = new Scanner(System.in);
         * System.out.println("PLease enter a number: ");
         * 
         * // This nextInt() is used to scan the next input, input is provided by the
         * user
         * int num = sc.nextInt();
         * 
         * System.out.println("Octal String: " + Integer.toOctalString(num));
         */

        int num, i = 1, sum = 0, rem, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        num = sc.nextInt();
        temp = num;

        while (temp != 0) { // (59 != 0)
            rem = temp % 8; // 59%8 = 3; 7%8 = 7
            sum = sum + i * rem; // 0 + 1*3 = 3; 3 + 10*7 = 73
            i = i * 10; // i*10 = 10; 10*10 = 100
            temp = temp / 8; // 59/8 = 7; 7/8 = 0;
        }

        System.out.println("Octal value of " + num + " is: " + sum);
    }

}
