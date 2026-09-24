public class SortArray {

    public static void main(String[] args) {

        int[] numbers = {40, 10, 50, 20, 30};

        // Manual sorting using comparison logic
        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] > numbers[j]) {

                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Array in ascending order:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
