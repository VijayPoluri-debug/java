public class TypeCastingExample {

    public static void main(String[] args) {

        // Implicit type casting: int is automatically converted to double
        int number = 20;
        double convertedNumber = number;

        System.out.println("Original int value: " + number);
        System.out.println("After implicit casting to double: " + convertedNumber);


        // Explicit type casting: double is manually converted to int
        double price = 99.75;
        int convertedPrice = (int) price;

        System.out.println("Original double value: " + price);
        System.out.println("After explicit casting to int: " + convertedPrice);
    }
}