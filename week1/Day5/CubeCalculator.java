// 2. CubeCalculator.java
import java.util.Scanner;

public class CubeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double cube = number * number * number;

        System.out.println("Cube: " + cube);

        scanner.close();
    }
}