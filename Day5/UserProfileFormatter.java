import java.util.Scanner;

public class UserProfileFormatter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read user profile details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your role: ");
        String role = scanner.nextLine();

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        System.out.print("Enter your contact number: ");
        String contact = scanner.nextLine();

        // Display the information in a structured profile card
        System.out.println("\n==============================");
        System.out.println("         USER PROFILE");
        System.out.println("==============================");
        System.out.println("Name    : " + name);
        System.out.println("Role    : " + role);
        System.out.println("City    : " + city);
        System.out.println("Contact : " + contact);
        System.out.println("==============================");

        scanner.close();
    }
}