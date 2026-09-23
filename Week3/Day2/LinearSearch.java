import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter a number to search: ");
        int searchNumber = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchNumber + " is present in the array");
        } else {
            System.out.println(searchNumber + " is not present in the array");
        }

        scanner.close();
    }
}