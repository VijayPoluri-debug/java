public class MethodBasics {

    // Method without return value
    public static void greet() {
        System.out.println("Hello! Welcome to Java Methods.");
    }

    // Method with parameters but no return value
    public static void displaySum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // Method with return value
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        // Calling method without return value
        greet();

        // Calling method with parameters
        displaySum(10, 20);

        // Calling method with return value
        int result = multiply(5, 4);

        System.out.println("Multiplication: " + result);
    }
}