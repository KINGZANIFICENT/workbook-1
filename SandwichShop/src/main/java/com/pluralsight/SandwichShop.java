package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // make scanner so we can get input


        // regular and large prices
        double basePrice = 5.45;
        double largePrice = 8.95;
        double price;
        // ask what size sandwich they want
        System.out.println("Choose A Sandwich size:");
        System.out.println("(1) Regular ($5.45)");
        System.out.println("(2) Large ($8.95)");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();
        // set price based on what they picked
        if (choice == 1) {
            price = basePrice;
        } else if (choice == 2) {
            price = largePrice;
        } else {
            System.out.println("Invalid choice. Restart your order.");  // if they didn't pick 1 or 2, cancel order
            return;
        }
        // ask if they want it loaded
        System.out.print("Would you like the sandwich loaded? (yes/no): ");
        scanner.nextLine(); // clear the newline
        String loaded = scanner.nextLine();
        // if yes, add extra charge based on size
        if (loaded.equalsIgnoreCase("yes")) {
            if (choice == 1) {
                price += 1.00;
            } else if (choice == 2) {
                price += 1.75;
            }
        }
        // show price before any discounts
        System.out.printf("Amount Owed: $%.2f\n", price);
        // ask for age to check if they get a discount
        System.out.print("Enter your age for a possible discount: ");
        int age = scanner.nextInt();
        // give 10% off for kids 17 and under
        if (age <= 17) {
            price *= 0.90;
        } else if (age >= 65) { // give 20% off for seniors 65 and older
            price *= 0.80;
        }
        System.out.printf("Amount Owed: $%.2f\n", price); // final amount owed after any discount
    }
}