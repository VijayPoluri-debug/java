import java.util.Scanner;

public class PrimeNumbersInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers are:");

        for (int number = start; number <= end; number++) {

            if (number < 2) {
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }

        scanner.close();
    }
}