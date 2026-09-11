import java.util.Scanner;

public class ArithmeticMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Display menu options
        System.out.println("Arithmetic Menu");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Read menu choice
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        // Read two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform operation based on user choice
        switch (choice) {

            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}