import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();
        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();

        System.out.println("Your age is: " + age);
        System.out.println("Your name is: " + name);

        scanner.close();
    }
}
