import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the bill amount from the user
        System.out.print("Enter bill amount: ");
        double billAmount = scanner.nextDouble();

        double discountPercent;

        // Apply discount based on bill amount range
        if (billAmount >= 5000) {
            discountPercent = 20;
        } else if (billAmount >= 3000) {
            discountPercent = 15;
        } else if (billAmount >= 1000) {
            discountPercent = 10;
        } else {
            discountPercent = 0;
        }

        // Calculate discount amount
        double discountAmount = billAmount * discountPercent / 100;

        // Calculate final amount after discount
        double finalAmount = billAmount - discountAmount;

        // Display results clearly
        System.out.println("\n----- BILL SUMMARY -----");
        System.out.println("Original Amount : " + billAmount);
        System.out.println("Discount        : " + discountPercent + "%");
        System.out.println("Discount Amount : " + discountAmount);
        System.out.println("Final Amount    : " + finalAmount);

        scanner.close();
    }
}