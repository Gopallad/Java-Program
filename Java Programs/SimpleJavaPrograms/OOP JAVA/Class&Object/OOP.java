abstract class Student {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void study();
}

class EngineerStudent extends Student {

    @Override
    void study() {
        System.out.println("Engineering student is studying Java");
    }
}

public class OOP {

    public static void main(String[] args) {

        Student student = new EngineerStudent();

        student.setName("Gopal");

        System.out.println(student.getName());

        student.study();
    }
}