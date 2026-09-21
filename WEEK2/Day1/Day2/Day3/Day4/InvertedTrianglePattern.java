public class InvertedTrianglePattern {

    public static void main(String[] args) {

        int rows = 5;

        // Outer loop controls the rows
        for (int i = rows; i >= 1; i--) {

            // Inner loop prints stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}