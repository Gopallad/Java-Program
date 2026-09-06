
class Student {

    int marks = 50;

}

class Result extends Student {

    int marks = 90;

    void display() {
        // System.out.println("Student marks: " + super.marks);
        System.out.println("Result marks: " + marks);
    }

    public static void main(String[] args) {

        Result r = new Result();

        r.display();
    }
}
