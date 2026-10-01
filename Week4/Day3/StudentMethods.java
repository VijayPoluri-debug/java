public class StudentMethods {

    int id;
    String name;

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public void update(int newId, String newName) {
        id = newId;
        name = newName;
    }

    public static void main(String[] args) {

        StudentMethods student = new StudentMethods();

        student.id = 101;
        student.name = "Vijay";

        System.out.println("Before Update:");
        student.display();

        student.update(102, "Rahul");

        System.out.println("\nAfter Update:");
        student.display();
    }
}