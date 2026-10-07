class Parent {

    final int number = 100;   // final variable

    final void showMessage() {   // final method
        System.out.println("This is a final method");
    }
}

final class Utility {   // final class

    void display() {
        System.out.println("This is a final class");
    }
}

public class FinalKeywordDemo {

    public static void main(String[] args) {

        Parent parent = new Parent();

        System.out.println("Final variable: " + parent.number);

        parent.showMessage();

        Utility utility = new Utility();
        utility.display();
    }
}