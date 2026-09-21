import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Negative numbers are not Armstrong numbers.");
            scanner.close();
            return;
        }

        int original = number;
        int temp = number;
        int digits = 0;

        // Count the digits. Zero also has one digit.
        do {
            digits++;
            temp = temp / 10;
        } while (temp > 0);

        temp = number;
        long sum = 0;

        // Extract each digit and calculate its power.
        while (temp > 0) {
            int digit = temp % 10;
            long power = 1;

            for (int i = 0; i < digits; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        scanner.close();
    }
}