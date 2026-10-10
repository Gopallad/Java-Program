
class Person {

    void display() {
        System.out.println("I am a person");
    }
}

interface Coder {

    void writeCode();
}

interface Tester {

    void testCode();
}

public class Hybrid extends Person implements Coder, Tester {

    public void writeCode() {
        System.out.println("Writing Java code");
    }

    public void testCode() {
        System.out.println("Testing java code");
    }

    public static void main(String[] args) {

        Hybrid obj = new Hybrid();

        obj.display();
        obj.writeCode();
        obj.testCode();
    }
}
