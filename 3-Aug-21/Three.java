package com.company;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        // Take input name from user and print greeting message
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = input.nextLine();
        System.out.println("Hello! " + name);

    }
}
