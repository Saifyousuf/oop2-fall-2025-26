package Projects;

import java.util.*;
import java.text.*;

public class MortgageCalculator3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary, credit, loan, rate;
        int year;
        boolean record;

        while (true) {
            System.out.print("Enter your monthly salary: ");
            if (sc.hasNextDouble()) {
                salary = sc.nextDouble();
                break;
            }
            System.out.println("Invalid input!");
            sc.next();
        }

        while (true) {
            System.out.print("Enter your credit score (0-500): ");
            if (sc.hasNextDouble()) {
                credit = sc.nextDouble();
                if (credit >= 0 && credit <= 500)
                    break;
                else
                    System.out.println("Credit score must be between 0 and 500.");
            } else {
                System.out.println("Invalid input!");
                sc.next();
            }
        }

        while (true) {
            System.out.print("Do you have a criminal record? (true/false): ");
            if (sc.hasNextBoolean()) {
                record = sc.nextBoolean();
                break;
            }
            System.out.println("Invalid input!");
            sc.next();
        }

        if (credit < 300 || record) {
            System.out.println("\nSorry, you are not eligible for a loan.");
            sc.close();
            return;
        }

        while (true) {
            System.out.print("Enter your desired loan amount: ");
            if (sc.hasNextDouble()) {
                loan = sc.nextDouble();
                if (loan <= 2 * salary)
                    break;
                else
                    System.out.println("Loan amount cannot exceed twice your salary.");
            } else {
                System.out.println("Invalid input!");
                sc.next();
            }
        }

        while (true) {
            System.out.print("Enter annual interest rate (in %): ");
            if (sc.hasNextDouble()) {
                rate = sc.nextDouble();
                break;
            }
            System.out.println("Invalid input!");
            sc.next();
        }

        while (true) {
            System.out.print("Enter loan period in years: ");
            if (sc.hasNextDouble()) {
                year = (int) sc.nextDouble();
                break;
            }
            System.out.println("Invalid input!");
            sc.next();
        }

        double mRate = rate / 100 / 12;
        int months = year * 12;
        double monthly = loan * (mRate * Math.pow(1 + mRate, months)) /
                (Math.pow(1 + mRate, months) - 1);

        double total = monthly * months;
        double interest = total - loan;

        Locale bd = new Locale("en", "BD");
        NumberFormat tk = NumberFormat.getCurrencyInstance(bd);

        System.out.println("\n=== Mortgage Summary ===");
        System.out.println("Loan Amount: " + tk.format(loan));
        System.out.println("Monthly Payment: " + tk.format(monthly));
        System.out.println("Total Payment: " + tk.format(total));
        System.out.println("Total Interest: " + tk.format(interest));

        sc.close();
    }
}
