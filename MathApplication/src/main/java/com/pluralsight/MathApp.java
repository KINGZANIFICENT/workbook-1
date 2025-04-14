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
        double bobSalary = 70000;
        double garySalary = 85000;

        double highestSalary;


        highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("the answer is " + highestSalary);

        /// ///////////////////////////////////////////////////////////////////

        double carPrice = 50000;
        double truckPrice = 35000;

        double highestPrice;

        highestPrice = Math.max(carPrice, truckPrice);

        System.out.println("the answer is " + highestPrice);

        /// //////////////////////////////////////////////////////////////////

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The Area Of The Circle IS " + area);

        /// /////////////////////////////////////////////////////////////////

        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        System.out.println("The Square Root Of " + number + " is " + squareRoot);

        /// //////////////////////////////////////////////////////////////////

        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the points is: " + distance);

        /// ///////////////////////////////////////////////////////////////////

        double PositiveNumber = -3.8;
        double absoluteValue = Math.abs(PositiveNumber);

        System.out.println("The absolute value of " + PositiveNumber + " is: " + absoluteValue);

        /// /////////////////////////////////////////////////////////////////////////

        double randomNumber = Math.random();

        System.out.println("A random number between 0 and 1: " + randomNumber);

        /// //////////////////////////////////////////////////////////////////////////

    }

}
