public class Employee {

    int id;
    String name;
    double salary;

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.id = 101;
        employee.name = "Vijay";
        employee.salary = 75000;

        employee.display();
    }
}