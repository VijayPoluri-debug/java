public class NumberPattern {

    public static void main(String[] args) {

        int rows = 4;

        // Outer loop controls the rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop prints numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Move to the next line
            System.out.println();
        }
    }
}