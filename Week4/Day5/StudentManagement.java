import java.util.Scanner;

class Student {

    int id;
    String name;
    double marks;

    public void displayStudent() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter Student ID: ");
        student.id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        student.name = scanner.nextLine();

        System.out.print("Enter Student Marks: ");
        student.marks = scanner.nextDouble();

        System.out.println("\nStudent Details");
        student.displayStudent();

        scanner.close();
    }
}