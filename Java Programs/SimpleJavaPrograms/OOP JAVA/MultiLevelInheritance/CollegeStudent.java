
class School {

    void study() {
        System.out.println("Student Studies");
    }
}

class Student extends School {

    void attendclass() {
        System.out.println("Student attends class");
    }
}

public class CollegeStudent extends Student {

    void attendExam() {
        System.out.println("College Student attends exam");
    }

    public static void main(String[] args) {
        CollegeStudent s = new CollegeStudent();

        s.study();
        s.attendclass();
        s.attendExam();
    }
}
