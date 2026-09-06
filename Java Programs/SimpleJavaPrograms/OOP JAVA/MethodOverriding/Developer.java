
class Employee {

    void work() {
        System.out.println("Employee is working: ");
    }
}

class Developer extends Employee {

    void work() {
        super.work();
        System.out.println("Developer writes code");
    }

    public static void main(String[] args) {

        Developer d = new Developer();

        d.work();
    }
}
