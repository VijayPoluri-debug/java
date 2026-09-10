import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        double circleArea = Math.PI * radius * radius;

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();

        double rectangleArea = length * width;

        // Triangle
        System.out.print("Enter base of triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = scanner.nextDouble();

        double triangleArea = 0.5 * base * height;

        // Display results
        System.out.println("\nArea Results");
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Triangle Area: " + triangleArea);

        scanner.close();
    }
}