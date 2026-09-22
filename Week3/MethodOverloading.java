public class MethodOverloading {

    public static void calculate(int a, int b) {
        System.out.println("Integer Addition: " + (a + b));
    }

    public static void calculate(int a, int b, int c) {
        System.out.println("Three Number Addition: " + (a + b + c));
    }

    public static void calculate(double a, double b) {
        System.out.println("Double Addition: " + (a + b));
    }

    public static void main(String[] args) {
        calculate(10, 20);
        calculate(10, 20, 30);
        calculate(5.5, 4.5);
    }
}