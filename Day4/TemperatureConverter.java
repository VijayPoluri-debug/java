import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Display menu options
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        // Check which conversion the user selected
        if (choice == 1) {

            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();

            // Formula: Fahrenheit = (Celsius * 9/5) + 32
            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        } else if (choice == 2) {

            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            // Formula: Celsius = (Fahrenheit - 32) * 5/9
            double celsius = (fahrenheit - 32) * 5 / 9;

            System.out.println("Temperature in Celsius: " + celsius);

        } else {

            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}