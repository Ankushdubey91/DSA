package com.company;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        // Take two numbers and an operator as input and calculate the value

        System.out.println("Program to Take two numbers and an operator as input and calculate the value");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number : ");
        float num1 = input.nextFloat();

        System.out.print("Enter second number : ");
        float num2 = input.nextFloat();

        System.out.print("Enter operator (+,-,*,/) : ");
        char operator = input.next().charAt(0);

        if (operator == '+' ){
            float sum = num1 + num2;
            System.out.println("Addition is : " + sum);
        } else if(operator == '-'){
            float sub = num1 - num2;
            System.out.println("Subtraction is : " + sub);
        } else if(operator == '*'){
            float mul = num1 + num2;
            System.out.println("Multiplication is : " + mul);
        } else if(operator == '/') {
            float div = num1/num2;
            System.out.println("Division is : " + div);
        } else {
            System.out.println("Select correct operator");
        }
    }
}
