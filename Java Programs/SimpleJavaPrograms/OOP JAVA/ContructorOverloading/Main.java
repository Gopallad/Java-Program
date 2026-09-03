
class Student {

    String name;
    int age;

    // Constructor 1
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2
    Student(String name) {
        this.name = name;
        age = 0;
    }

    // Constructor 3
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Gopal");
        Student s3 = new Student("Gopal", 25);

        s1.display();
        s2.display();
        s3.display();
    }
}
