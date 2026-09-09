
abstract class Employee {

    void login() {
        System.out.println("Employee logged in");
    }

    abstract void work();
}

class Developer extends Employee {

    void work() {
        System.out.println("Developer writes code");
    }

    public static void main(String[] args) {

        Developer d = new Developer();

        d.work();
        d.login();
    }
}
