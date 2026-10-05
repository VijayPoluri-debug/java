import java.util.Scanner;

public class WeeklyTest4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Largest = " + largest);

        System.out.print("Enter number to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }

        sc.close();
    }
}
