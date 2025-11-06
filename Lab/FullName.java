import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = in.nextLine();

        System.out.print("Enter last name: ");
        String last = in.nextLine();

        String fullName = first + " " + last;
        System.out.println("Full name: " + fullName);

        in.close();
    }
}
