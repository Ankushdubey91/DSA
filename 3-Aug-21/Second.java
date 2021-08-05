package com.company;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        // Check whether number is odd or even

        System.out.print("Enter number to check whether it is odd or even : ");
        Scanner input = new Scanner(System.in);
        float number = input.nextFloat();
        if (number%2==0) {
            System.out.println(number + " is even number.");
        } else {
            System.out.println(number + " is odd number.");
        }
    }
}
