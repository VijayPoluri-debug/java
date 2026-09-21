public class RightTrianglePattern {

    public static void main(String[] args) {

        int rows = 5;

        // Outer loop controls the number of rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop prints stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}