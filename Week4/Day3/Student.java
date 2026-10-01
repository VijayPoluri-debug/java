public class Student {

    int id;
    String name;
    int age;

    public static void main(String[] args) {

        Student student = new Student();

        student.id = 101;
        student.name = "Vijay";
        student.age = 25;

        System.out.println("Student ID: " + student.id);
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Age: " + student.age);
    }
}