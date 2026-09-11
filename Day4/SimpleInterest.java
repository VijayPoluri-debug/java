import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read principal amount
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        // Read rate of interest
        System.out.print("Enter interest rate: ");
        double rate = scanner.nextDouble();

        // Read time in years
        System.out.print("Enter time in years: ");
        double time = scanner.nextDouble();

        // Simple Interest formula:
        // SI = (Principal * Rate * Time) / 100
        double simpleInterest = (principal * rate * time) / 100;

        // Display the calculated simple interest
        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }
}