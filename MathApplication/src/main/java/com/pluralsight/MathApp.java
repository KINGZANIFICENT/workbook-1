package com.pluralsight;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class MathApp {

    public static void main(String[] args){

        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        // Question 1:
        System.out.println("Determine whose salary is greater");
        double bobSalary = 70000;
        double garySalary = 85000;

        double highestSalary;


        highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("the answer is " + highestSalary);

        // ///////////////////////////////////////////////////////////////////

        // Question 2:
        System.out.println("Find and display the smallest of two variables");

        double carPrice = 50000;
        double truckPrice = 35000;

        double highestPrice;

        highestPrice = Math.max(carPrice, truckPrice);

        System.out.println("the answer is " + highestPrice);

        // //////////////////////////////////////////////////////////////////

        // Question 3:
        System.out.println("Find and display the area of a circle whose radius is 7.25");

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The Area Of The Circle IS " + area);

        // /////////////////////////////////////////////////////////////////

        // Question 4:
        System.out.println("Find and display the square root a variable after it is set to 5.0");

        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        System.out.println("The Square Root Of " + number + " is " + squareRoot);

        // //////////////////////////////////////////////////////////////////

        // Question 5:
        System.out.println("Find and display the distance between the points (5, 10) and (85, 50)");

        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the points is: " + distance);

        // ///////////////////////////////////////////////////////////////////

        // Question 6:
        System.out.println("Find and display the absolute (positive) value of a variable after it is set to -3.8");

        double NegativeNumber = -3.8;
        double absoluteValue = Math.abs(NegativeNumber);

        System.out.println("The absolute value of " + NegativeNumber + " is: " + absoluteValue);

        // /////////////////////////////////////////////////////////////////////////

        // Question 7:
        System.out.println("Find and display a random number between 0 and 1");

        double randomNumber = Math.random();

        System.out.println("A random number between 0 and 1: " + randomNumber);

        // //////////////////////////////////////////////////////////////////////////

    }

}
