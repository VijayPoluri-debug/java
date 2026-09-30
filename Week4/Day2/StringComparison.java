import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = sc.nextLine();

        System.out.print("Enter second string: ");
        String second = sc.nextLine();

        System.out.println("equals: " + first.equals(second));
        System.out.println("equalsIgnoreCase: " + first.equalsIgnoreCase(second));
        System.out.println("compareTo: " + first.compareTo(second));

        sc.close();
    }
}