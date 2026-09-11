import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter marks
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        // Check the marks using an if-else ladder
        // The first condition that becomes true will be executed
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else if (marks >= 0) {
            System.out.println("Grade: F");
        } else {
            // This handles invalid negative marks
            System.out.println("Invalid marks");
        }

        // Close the Scanner after using it
        scanner.close();
    }
}