
class Person {

    void walk() {
        System.out.println("Person is walking");
    }
}

public class Student extends Person {

    void Study() {
        System.out.println("Student is Studying");
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.Study();
        s.walk();
    }
}
