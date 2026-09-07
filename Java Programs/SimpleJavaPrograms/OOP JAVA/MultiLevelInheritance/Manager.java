
class Person {

    void walk() {
        System.out.println("Person is walking");
    }
}

class Employee extends Person {

    void work() {
        System.out.println("Employee is working");
    }
}

public class Manager extends Employee {

    void manage() {
        System.out.println("Manager manage the team");
    }

    public static void main(String[] args) {

        Manager m = new Manager();

        m.walk();
        m.work();
        m.manage();
    }
}
