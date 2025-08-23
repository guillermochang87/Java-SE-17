package com.gdcg.udemy;

/*
 * For a leap year, there are few rules:
 * Rule 1: If a year is divisible by 4, it might be a leap year
 * Rule 2: But if its also divisible by 100, it is not a leap year
 * Rule 3: Unless it is also divisible by 400, then it is a leap year
 */
public class LeapYearChecker {

    public static void main(String[] args) {

        int year = 2024;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
