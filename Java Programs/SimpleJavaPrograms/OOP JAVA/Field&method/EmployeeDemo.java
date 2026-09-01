
class Employee {

    String name;
    double salary;

    void increaseSalary(double amount) {
        salary = salary + amount;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {
        Employee e = new Employee();

        e.name = "Kiran";
        e.salary = 45000;

        e.increaseSalary(5000);

        e.display();
    }
}
