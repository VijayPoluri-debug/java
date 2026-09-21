public class AlphabetPattern {

    public static void main(String[] args) {

        int rows = 3;

        // Outer loop controls rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop prints letters from A onward
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j));
            }

            // Move to next line
            System.out.println();
        }
    }
}