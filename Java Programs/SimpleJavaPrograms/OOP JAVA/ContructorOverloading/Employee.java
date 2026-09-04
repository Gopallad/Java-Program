
class Employee {

    int id;
    String name;
    double salary;

    Employee() {
        id = 0;
        name = "Gopal";
        salary = 60000;
    }

    Employee(int id) {
        this.id = id;
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        Employee e1 = new Employee(101);

        Employee e2 = new Employee(102, "Akshu");

        Employee e3 = new Employee(101, "Gopal", 60000);

        e.display();
        e1.display();
        e2.display();
        e3.display();
    }
}
