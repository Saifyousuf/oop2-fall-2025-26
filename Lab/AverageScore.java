
import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s1, s2, s3, avg;

        System.out.print("Enter score of student 1: ");
        s1 = in.nextDouble();
        System.out.print("Enter score of student 2: ");
        s2 = in.nextDouble();
        System.out.print("Enter score of student 3: ");
        s3 = in.nextDouble();

        avg = (s1 + s2 + s3) / 3;
        System.out.printf("Average score: %.2f\n", avg);
    }
}
