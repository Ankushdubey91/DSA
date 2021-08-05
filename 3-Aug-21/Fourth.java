package com.company;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {

        // Calculate Simple Interest
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principle Amount : ");
        double principle = input.nextDouble();

        System.out.print("Enter Rate in percentage : ");
        double rate = input.nextDouble();

        System.out.print("Enter Time : ");
        double time = input.nextDouble();

        double simple_interest = principle * 0.01 * rate * time;
        System.out.println("Simple Interest is : " + simple_interest);

    }
}
