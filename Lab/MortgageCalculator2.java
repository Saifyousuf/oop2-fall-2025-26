
import java.util.*;
import java.text.*;

public class MortgageCalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your monthly salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your credit score (0-500): ");
        double score = sc.nextDouble();

        System.out.print("Do you have a criminal record? (true/false): ");
        boolean record = sc.nextBoolean();

        Loan loan = new Loan(salary, score, record);
        loan.process(sc);

        sc.close();
    }
}

class Loan {
    private double salary;
    private double score;
    private boolean record;

    Loan(double s, double c, boolean r) {
        salary = s;
        score = c;
        record = r;
    }

    void process(Scanner sc) {
        if (score < 300 || record) {
            System.out.println("\nSorry, you are not eligible for a loan.");
            return;
        }

        System.out.print("Enter desired loan amount: ");
        double amount = sc.nextDouble();

        if (amount > 2 * salary) {
            System.out.println("\nLoan request denied. Amount exceeds limit.");
            return;
        }

        System.out.print("Enter annual interest rate (in %): ");
        double rate = sc.nextDouble();

        System.out.print("Enter loan period in years: ");
        int year = sc.nextInt();

        double mRate = rate / 100 / 12;
        int months = year * 12;

        double monthly = amount * (mRate * Math.pow(1 + mRate, months)) /
                (Math.pow(1 + mRate, months) - 1);

        double total = monthly * months;
        double interest = total - amount;

        Locale bd = new Locale("en", "BD");
        NumberFormat tk = NumberFormat.getCurrencyInstance(bd);

        System.out.println("\n=== Mortgage Summary ===");
        System.out.println("Loan Amount: " + tk.format(amount));
        System.out.println("Monthly Payment: " + tk.format(monthly));
        System.out.println("Total Payment: " + tk.format(total));
        System.out.println("Total Interest: " + tk.format(interest));
    }
}
