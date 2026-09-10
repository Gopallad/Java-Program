
class Student {

    int rollNo;
    String name;

    static String college = "CDAC";

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class StaticVariableExample {

    public static void main(String[] args) {
        Student a = new Student(1, "Gopal");

        Student b = new Student(2, "Kisna");

        a.display();
        b.display();
    }
}
