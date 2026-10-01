public class StudentConstructor {

    int id;
    String name;

    // Default constructor
    StudentConstructor() {
        id = 101;
        name = "Vijay";
    }

    // Parameterized constructor
    StudentConstructor(int studentId, String studentName) {
        id = studentId;
        name = studentName;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        StudentConstructor student1 = new StudentConstructor();
        student1.display();

        System.out.println();

        StudentConstructor student2 = new StudentConstructor(102, "Rahul");
        student2.display();
    }
}