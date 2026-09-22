public class MethodParameters {

    public static void addition(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public static void subtraction(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public static void maximum(int a, int b) {
        if (a > b) {
            System.out.println("Maximum: " + a);
        } else {
            System.out.println("Maximum: " + b);
        }
    }

    public static void minimum(int a, int b) {
        if (a < b) {
            System.out.println("Minimum: " + a);
        } else {
            System.out.println("Minimum: " + b);
        }
    }

    public static void main(String[] args) {

        addition(20, 10);
        subtraction(20, 10);
        maximum(20, 10);
        minimum(20, 10);
    }
}