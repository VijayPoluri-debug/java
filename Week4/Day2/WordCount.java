import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        int count = 0;
        if (!sentence.isEmpty()) {
            count = sentence.split("\\s+").length;
        }

        System.out.println("Total words: " + count);
        sc.close();
    }
}