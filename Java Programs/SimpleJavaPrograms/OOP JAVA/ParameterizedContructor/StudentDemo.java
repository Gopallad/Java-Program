
class Student {

    String name;
    int age;

    public Student() {
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age" + age);
    }
}

public class StudentDemo {

    public static void main(String[] args) {
        Student a = new Student("Gopal", 25);
        a.display();
    }
}
