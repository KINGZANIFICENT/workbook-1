package com.pluralsight;
import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A PickUp Date MM/DD/YYYY: ");
        String pickupDate = scanner.nextLine();

        System.out.print("Number Of Days Rented: ");
        int days = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Do You Want An Electric Toll Tag Starting at $3.95 a day (yes/no)");
        String toll = scanner.nextLine();

        System.out.print("Do You Want GPS at $2.95 a day (yes/no)");
        String gps = scanner.nextLine();

        System.out.print("Do You Want Roadside Assistance Starting at $3.95 a day (yes/no)");
        String roadside = scanner.nextLine();

        System.out.print("How Old Are You");
        int age = scanner.nextInt();

        if (age <= 25) {
            System.out.println("Underage surcharge added.");
        }

        double base = 29.99 * days;
        double options = 0;

        if (toll.equalsIgnoreCase("yes")) options += 3.95 * days;
        if (gps.equalsIgnoreCase("yes")) options += 2.95 * days;
        if (roadside.equalsIgnoreCase("yes")) options += 3.95 * days;
        if (toll.equalsIgnoreCase("no") && gps.equalsIgnoreCase("no") && roadside.equalsIgnoreCase("no")) {
            System.out.println("No extra packages selected.");
        }

        double underage = (age < 25) ? base * 0.3 : 0;
        double total = base + options + underage;

        System.out.println("Total Owed: $" + total);
    }
}