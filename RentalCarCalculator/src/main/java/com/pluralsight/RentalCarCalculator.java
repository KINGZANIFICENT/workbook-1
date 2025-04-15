package com.pluralsight;
import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner to get input

        System.out.print("Enter A PickUp Date MM/DD/YYYY: "); // asks for pickupdate
        String pickupDate = scanner.nextLine();

        System.out.print("Number Of Days Rented: "); // asks for how long the car is going to be rented
        int days = scanner.nextInt();
        scanner.nextLine(); // clear the buffer

        System.out.print("Do You Want An Electric Toll Tag Starting at $3.95 a day (yes/no)"); // asks if they want to add the toll tag
        String toll = scanner.nextLine();

        System.out.print("Do You Want GPS at $2.95 a day (yes/no)"); // asks if they want GPS
        String gps = scanner.nextLine();

        System.out.print("Do You Want Roadside Assistance Starting at $3.95 a day (yes/no)");  // asks if they want roadside assistance
        String roadside = scanner.nextLine();

        System.out.print("How Old Are You"); // asks the persons age
        int age = scanner.nextInt();

        if (age <= 25) {
            System.out.println("Underage surcharge added."); // If the person is 25 or younger notifies about the surcharge
        }
        // Calculate the base cost of the rental
        double base = 29.99 * days;
        double options = 0;
        // Add costs for optional packages based on user's choices
        if (toll.equalsIgnoreCase("yes")) options += 3.95 * days;
        if (gps.equalsIgnoreCase("yes")) options += 2.95 * days;
        if (roadside.equalsIgnoreCase("yes")) options += 3.95 * days;
        if (toll.equalsIgnoreCase("no") && gps.equalsIgnoreCase("no") && roadside.equalsIgnoreCase("no")) {
            System.out.println("No extra packages selected.");
        }
        // If no extras were selected display a message

        // Add a surcharge if the user is under 25
        double underage = (age < 25) ? base * 0.3 : 0;

        // Calculate the final total
        double total = base + options + underage;


        // Display the total amount owed
        System.out.println("Total Owed: $" + total);
    }
}