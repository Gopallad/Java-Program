
class Employee {

    int id;
    String name;

    static String company = "TCS";

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + company);
    }

}

public class CompanyStaticExample {

    public static void main(String[] args) {
        Employee e = new Employee(1, "Kratik");
        Employee e1 = new Employee(2, "Kumar");

        e.display();
        e1.display();

    }
}
