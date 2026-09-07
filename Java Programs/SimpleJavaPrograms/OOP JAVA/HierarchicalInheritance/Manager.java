
class Employee {

    void attendOffice() {
        System.out.println("Employee attends office");
    }
}

class Developer extends Employee {

    void writeCode() {
        System.out.println("Developer writes code");
    }
}

class Manager extends Employee {

    void manage() {
        System.out.println("Manager manage team");
    }

    public static void main(String[] args) {

        Developer d = new Developer();
        d.attendOffice();
        d.writeCode();

        Manager m = new Manager();
        m.attendOffice();
        m.manage();
    }
}
