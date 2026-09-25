public class UtilityMethodsProgram {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Addition: " + add(10, 5));
        System.out.println("Maximum: " + findMax(numbers));
        System.out.println("Array Sum: " + arraySum(numbers));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int findMax(int[] numbers) {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static int arraySum(int[] numbers) {

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}