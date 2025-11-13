package Projects;

import java.util.*;
import java.text.*;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = getDouble(sc, "Enter your monthly salary: ");
        double credit = getCredit(sc);
        boolean record = getBoolean(sc);

        if (credit < 300 || record) {
            System.out.println("\nSorry, you are not eligible for a loan.");
            sc.close();
            return;
        }

        double loan = getDouble(sc, "Enter your desired loan amount: ");
        if (loan > 2 * salary) {
            System.out.println("\nLoan request denied. Loan amount cannot exceed twice your salary.");
            sc.close();
            return;
        }

        double rate = getDouble(sc, "Enter annual interest rate (in %): ");
        int year = (int) getDouble(sc, "Enter loan period in years: ");

        double mRate = rate / 100 / 12;
        int months = year * 12;

        double monthly = loan * (mRate * Math.pow(1 + mRate, months)) / (Math.pow(1 + mRate, months) - 1);
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

    static double getDouble(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            if (sc.hasNextDouble())
                return sc.nextDouble();
            System.out.println("Invalid input!");
            sc.next();
        }
    }

    static double getCredit(Scanner sc) {
        while (true) {
            System.out.print("Enter your credit score (0-500): ");
            if (sc.hasNextDouble()) {
                double c = sc.nextDouble();
                if (c >= 0 && c <= 500)
                    return c;
                System.out.println("Credit score must be between 0 and 500.");
            } else {
                System.out.println("Invalid input!");
                sc.next();
            }
        }
    }

    static boolean getBoolean(Scanner sc) {
        while (true) {
            System.out.print("Do you have a criminal record? (true/false): ");
            if (sc.hasNextBoolean())
                return sc.nextBoolean();
            System.out.println("Invalid input!");
            sc.next();
        }
    }
}
