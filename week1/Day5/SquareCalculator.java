// 1. SquareCalculator.java
import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double square = number * number;

        System.out.println("Square: " + square);

        scanner.close();
    }
}