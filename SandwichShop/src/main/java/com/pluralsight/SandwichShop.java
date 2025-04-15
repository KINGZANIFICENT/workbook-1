package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double basePrice = 5.45;
        double largePrice = 8.95;
        double price;

        System.out.println("Choose A Sandwich size:");
        System.out.println("(1) Regular ($5.45)");
        System.out.println("(2) Large ($8.95)");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            price = basePrice;
        } else if (choice == 2) {
            price = largePrice;
        } else {
            System.out.println("Invalid choice. Restart your order.");
            return;
        }

        System.out.print("Would you like the sandwich loaded? (yes/no): ");
        scanner.nextLine(); // clear the newline
        String loaded = scanner.nextLine();

        if (loaded.equals("yes")) {
            if (choice == 1) {
                price += 1.00;
            } else if (choice == 2) {
                price += 1.75;
            }
        }

        System.out.printf("Amount Owed: $%.2f\n", price);

        System.out.print("Enter your age for a possible discount: ");
        int age = scanner.nextInt();

        if (age <= 17) {
            price *= 0.90;
        } else if (age >= 65) {
            price *= 0.80;
        }
        System.out.printf("Amount Owed: $%.2f\n", price);

    }
}











//     if(HoursWorked > 40) {
//float OvertimeHours = HoursWorked - 40;
//totalPay = (40 * PayRate) + (OvertimeHours * PayRate * 2);
//        } else {
//totalPay = HoursWorked * PayRate;
//        }