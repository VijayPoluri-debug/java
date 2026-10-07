class Student {

    static String college = "ABC College";   // static variable
    static int count = 0;                    // static counter

    String name;

    Student(String name) {
        this.name = name;
        count++;
    }

    static void showCollege() {              // static method
        System.out.println("College: " + college);
    }

    void displayStudent() {
        System.out.println("Student Name: " + name);
    }
}

public class StaticKeywordDemo {

    public static void main(String[] args) {

        Student.showCollege();

        Student s1 = new Student("Vijay");
        Student s2 = new Student("Puneeth");
        Student s3 = new Student("Ravi");

        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();

        System.out.println("Total Students: " + Student.count);
    }
}