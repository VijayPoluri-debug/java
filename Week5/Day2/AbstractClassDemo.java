abstract class Animal {

    abstract void sound();
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClassDemo {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
    }
}