
class Person {

    void walk() {
        System.out.println("Person walks");
    }
}

class Student extends Person {

    void study() {
        System.out.println("Student studies");
    }
}

public class Employee extends Student {

    void work() {
        System.out.println("Employee works");
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.study();
        e.work();

        Student s = new Student();

        s.walk();
        s.study();
    }
}
