
class Employee {

    void work() {
        System.out.println("Employee is Working");
    }
}

public class Manager extends Employee {

    void manage() {
        System.out.println("Manager manager the team");
    }

    public static void main(String[] args) {

        Manager m = new Manager();

        m.manage();
        m.work();
    }
}
