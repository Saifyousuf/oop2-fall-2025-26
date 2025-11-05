
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double c, f;

        System.out.print("Enter temperature in Celsius: ");
        c = in.nextDouble();

        f = (c * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + f);
    }
}
