
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;

        System.out.print("Enter first number: ");
        a = in.nextInt();
        System.out.print("Enter second number: ");
        b = in.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
