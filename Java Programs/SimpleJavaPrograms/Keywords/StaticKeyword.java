
class Student {

    static String college = "CDAC";

    String name;

    public Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " " + college);
    }

}

public class StaticKeyword {

    public static void main(String[] args) {
        Student s1 = new Student("Gopal");
        Student s2 = new Student("Ganesh");

        s1.display();
        s2.display();

        System.out.println(Student.college);

    }
}
