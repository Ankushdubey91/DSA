package com.company;

import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        // Input currency in rupee output in dollar

        System.out.println("Program to take input currency in rupee output in dollar");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount(in rupees) : ");
        float rupee = input.nextFloat();

        // The current rate of the rupee against the dollar is 74.1365.
        // Suppose you have Rs 1000, then just divide 1000/74.1365=13.489 dollars.
        double dollar = rupee/74.1365;
        System.out.println("The entered amount in dollars is : " + dollar);
    }
}
