import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = in.nextLine();

        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        in.close();
    }
}
