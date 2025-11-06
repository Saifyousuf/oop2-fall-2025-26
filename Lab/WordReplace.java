import java.util.Scanner;

public class WordReplace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine();

        System.out.print("Word to replace: ");
        String oldWord = in.nextLine();

        System.out.print("New word: ");
        String newWord = in.nextLine();

        String result = sentence.replace(oldWord, newWord);
        System.out.println("Updated sentence: " + result);

        in.close();
    }
}
