
class Employee {

    int id;
    String name;
    double salary;

    Employee() {

    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    Employee(Employee e) {
        this.id = e.id;
        this.name = e.name;
        this.salary = e.salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {

        Employee e = new Employee(1, "Manish", 570000);

        Employee e1 = new Employee(e);

        e.display();
        e1.display();

    }

}
