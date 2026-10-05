import java.util.Scanner;

public class CountCharacters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println("Number of characters: " + text.length());

        scanner.close();
    }
}