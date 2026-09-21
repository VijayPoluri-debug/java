import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (1–93): ");
        int n = scanner.nextInt();

        if (n < 1 || n > 93) {
            System.out.println("Please enter a number between 1 and 93.");
            scanner.close();
            return;
        }

        long first = 0;
        long second = 1;

        System.out.print("Fibonacci series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            // Update only when another term is needed.
            if (i < n - 1) {
                long next = first + second;
                first = second;
                second = next;
            }
        }

        System.out.println();
        scanner.close();
    }
}