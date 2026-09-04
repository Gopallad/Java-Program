
class Student {

    int id;
    String name;

    Student() {
        id = 1;
        name = "Gopal";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Copy Constructor
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();

        Student s1 = new Student(101, "Gopal");

        Student s2 = new Student(s1);

        s.display();
        s1.display();
        s2.display();
    }
}
