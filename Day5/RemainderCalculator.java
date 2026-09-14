// 5. RemainderCalculator.java
import java.util.Scanner;

public class RemainderCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int remainder = num1 % num2;

        System.out.println("Remainder: " + remainder);

        scanner.close();
    }
}