import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter a character: ");
        char ch = sc.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("'" + ch + "' appears " + count + " times.");
        sc.close();
    }
}