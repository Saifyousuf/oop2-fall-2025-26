import java.util.Scanner;

public class EmailUsername {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = in.nextLine();

        int atIndex = email.indexOf("@");
        String username = email.substring(0, atIndex);

        System.out.println("Username: " + username);

        in.close();
    }
}
