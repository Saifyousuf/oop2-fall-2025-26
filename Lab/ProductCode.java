import java.util.Scanner;

public class ProductCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = in.nextLine();

        System.out.print("Enter product ID: ");
        String id = in.nextLine();

        String code = name + "-" + id;
        System.out.println("Product code: " + code);

        in.close();
    }
}
