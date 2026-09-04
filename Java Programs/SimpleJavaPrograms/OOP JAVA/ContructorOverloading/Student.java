
class Student {

    int id;
    String name;

    Student() {
        id = 0;
        name = "Gopal";
    }

    Student(int id) {
        this.id = id;
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student(101);

        Student s3 = new Student(101, "Rakesh");

        s1.display();
        s2.display();
        s3.display();
    }

}
