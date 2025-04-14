package com.pluralsight;
import java.util.Scanner;


public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number");
        float firstNumber = scanner.nextFloat();

        System.out.print("Enter the second number");
        float secondNumber = scanner.nextFloat();

        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("choose one");
        String choice = scanner.next();

        float result = firstNumber * secondNumber;

        System.out.println(firstNumber + " * " + secondNumber + " = " + result);

        scanner.close();


    }
}

