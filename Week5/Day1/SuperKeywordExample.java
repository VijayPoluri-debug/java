class Animal {

    Animal() {
        System.out.println("Animal constructor");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    Dog() {
        super();
        System.out.println("Dog constructor");
    }

    void display() {
        super.sound();
        System.out.println("Dog is barking");
    }
}

public class SuperKeywordExample {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.display();
    }
}
