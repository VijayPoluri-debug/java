import java.util.Scanner;

public class FactorialProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        long factorialFor = 1;

        // Using for loop:
        // Best when we know exactly how many times the loop should run.
        for (int i = 1; i <= n; i++) {
            factorialFor = factorialFor * i;
        }

        long factorialWhile = 1;
        int i = 1;

        // Using while loop:
        // Useful when the loop depends mainly on a condition.
        while (i <= n) {
            factorialWhile = factorialWhile * i;
            i++;
        }

        System.out.println("Factorial using for loop: " + factorialFor);
        System.out.println("Factorial using while loop: " + factorialWhile);

        scanner.close();
    }
}