package com.pluralsight;

public class Conditionals1 {
    public static void main(String[] args){

        double price;
        int age = 16;
        String name = "Angel";

        if (age < 18){
            price = 10.00;
        }
        else if (age > 65){
            price = 6.00;
        }
        else{
            price = 18.00;
        }

        System.out.println("You pay $" + price);
    }
}

