import java.util.Scanner;

public class ArrayMenuApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {40, 10, 30, 20, 50};

        System.out.println("Array Menu");
        System.out.println("1. Search");
        System.out.println("2. Reverse");
        System.out.println("3. Sort");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter number to search: ");
                int target = scanner.nextInt();

                boolean found = false;

                for (int number : numbers) {
                    if (number == target) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    System.out.println("Number found");
                } else {
                    System.out.println("Number not found");
                }

                break;

            case 2:
                System.out.println("Array in reverse order:");

                for (int i = numbers.length - 1; i >= 0; i--) {
                    System.out.print(numbers[i] + " ");
                }

                break;

            case 3:
                for (int i = 0; i < numbers.length - 1; i++) {

                    for (int j = i + 1; j < numbers.length; j++) {

                        if (numbers[i] > numbers[j]) {

                            int temp = numbers[i];
                            numbers[i] = numbers[j];
                            numbers[j] = temp;
                        }
                    }
                }

                System.out.println("Sorted array:");

                for (int number : numbers) {
                    System.out.print(number + " ");
                }

                break;

            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}