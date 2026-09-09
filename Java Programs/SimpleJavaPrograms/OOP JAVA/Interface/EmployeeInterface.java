
interface Employee {

    void work();
}

class Developer implements Employee {

    public void work() {
        System.out.println("Developer write code");
    }
}

class Tester implements Employee {

    public void work() {
        System.out.println("Tester tests software");
    }
}

public class EmployeeInterface {

    public static void main(String[] args) {
        Developer d = new Developer();

        d.work();

        Tester t = new Tester();

        t.work();
    }
}
