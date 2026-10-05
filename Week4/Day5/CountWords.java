import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        String[] words = text.trim().split("\\s+");

        System.out.println("Number of words: " + words.length);

        scanner.close();
    }
}