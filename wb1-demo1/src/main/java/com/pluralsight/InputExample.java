package com.pluralsight;
import java.util.*;
import java.awt.*;

public class InputExample {

    public  static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name");
        String name;
        name = scanner.nextLine();

        System.out.println("Hi" + name + ", lets do some math!");

        System.out.println("what is the first number");
        double number1 = scanner.nextDouble();

        System.out.println("what is the second number");
        double number2 = scanner.nextDouble();


//        double number1 = 4;
//        double number2 = 5;

        double product = number1 * number2;

        System.out.printf("the product of %.2f is %.4f\n", number1, number2, product);

//        System.out.println("");

    }
}
