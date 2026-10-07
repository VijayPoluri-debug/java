class Student {

    int id;
    String name;

    // Constructor 1
    Student() {
        this(101, "Puneeth");   // Constructor chaining
        System.out.println("Default constructor called");
    }

    // Constructor 2
    Student(int id, String name) {
        this.id = id;           // this.id refers to current object's variable
        this.name = name;       // this.name refers to current object's variable
    }

    void display() {
        System.out.println("Student ID: " + this.id);
        System.out.println("Student Name: " + this.name);
    }
}

public class ThisKeywordDemo {

    public static void main(String[] args) {

        Student student = new Student();

        student.display();
    }
}