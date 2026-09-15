public class ForLoopBasics {

    public static void main(String[] args) {

        // Ascending order
        // i starts at 1
        // loop continues while i <= 10
        // i++ increases i by 1 after each iteration
        System.out.println("Ascending Order:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Descending order
        // i starts at 10
        // loop continues while i >= 1
        // i-- decreases i by 1 after each iteration
        System.out.println("Descending Order:");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}