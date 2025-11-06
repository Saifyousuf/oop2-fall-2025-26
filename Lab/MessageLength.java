import java.util.Scanner;

public class MessageLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String msg = in.nextLine();

        int count = msg.length();
        System.out.println("Total characters: " + count);

        in.close();
    }
}
