package com.pluralsight;
import java.awt.*;
import java.util.Scanner;


public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Your Name");
        String Name = scanner.next();

        System.out.print("Enter Your Hours Worked");
        float HoursWorked = scanner.nextFloat();

        System.out.print("Enter Your Pay Rate");
        float PayRate = scanner.nextFloat();

        float totalPay = HoursWorked * PayRate;

        System.out.println("Name" + Name);
        System.out.println("Gross Pay" + totalPay);

        if(HoursWorked > 40) {
         float OvertimeHours = HoursWorked - 40;
         totalPay = (40 * PayRate) + (OvertimeHours * PayRate * 2);
        } else {
            totalPay = HoursWorked * PayRate;
        }

        System.out.println("Total Pay: $" + totalPay);

        scanner.close();
    }
}
