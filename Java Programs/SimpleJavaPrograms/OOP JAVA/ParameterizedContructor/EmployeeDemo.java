
class Employee {

    String name;
    int id;
    double salary;

    Employee() {
    }

    Employee(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
    }

}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e = new Employee("Gopal", 15, 650000);

        e.display();

        Employee v = new Employee("Bablu", 16, 850000);

        v.display();

    }
}
