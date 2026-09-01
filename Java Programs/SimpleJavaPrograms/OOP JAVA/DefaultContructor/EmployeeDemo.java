
class Employee {

    String name;

    Employee() {
        name = "Gopal";
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee a = new Employee();

        a.display();

    }
}
