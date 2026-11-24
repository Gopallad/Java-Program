class Parent {

    public void house() {
        System.out.println("Parent has a house");
    }
}

class Child1 extends Parent {

    public void car() {
        System.out.println("Child1 has a car");
    }
}

class Child2 extends Parent {

    public void bike() {
        System.out.println("Child2 has a bike");
    }
}

public class Hierachical {
    public static void main(String[] args) {

        Child1 a = new Child1();

        a.house();
        a.car();

        Child2 b = new Child2();

        b.house();
        b.bike();
    }
}