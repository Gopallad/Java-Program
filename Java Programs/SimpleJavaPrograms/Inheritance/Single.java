
class Parent {

    void displayA() {

        System.out.println("Parent class");
    }
}

class Child extends Parent {

    void displayB() {
        System.out.println("Child class");
    }
}

public class Single {

    public static void main(String[] args) {

        Child obj = new Child();

        obj.displayA();
        obj.displayB();
    }
}
