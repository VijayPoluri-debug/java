public class WrapperClassDemo {

    public static void main(String[] args) {

        int number = 100;

        // Primitive to Wrapper
        Integer wrapperNumber = Integer.valueOf(number);

        // Wrapper to Primitive
        int primitiveNumber = wrapperNumber.intValue();

        System.out.println("Primitive value: " + number);
        System.out.println("Wrapper object: " + wrapperNumber);
        System.out.println("Converted back to primitive: " + primitiveNumber);
    }
}