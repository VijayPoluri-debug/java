public class WhileLoopPractice {

    public static void main(String[] args) {

        // Print numbers from 1 to 5
        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("Countdown:");

        // Countdown from 5 to 1
        int count = 5;

        while (count >= 1) {
            System.out.println(count);
            count--;
        }

        System.out.println("Go!");
    }
}