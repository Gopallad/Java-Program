
class Employee {

    String name;
    int id;
    double salary;

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {
        Employee a = new Employee();

        a.name = "Kranti";
        a.id = 16;
        a.salary = 360000;

        a.display();
    }
}
