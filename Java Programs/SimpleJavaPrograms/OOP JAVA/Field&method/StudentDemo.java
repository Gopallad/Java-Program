
class Student {

    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Gopal";
        s.age = 23;

        s.display();
    }
}
