class Parent {

    public void house() {
        System.out.println("Parent has a house");
    }

}

class Child extends Parent {

    public void car() {
        System.out.println("Child has a car ");
    }
}

public class InheritanceS {

    public static void main(String[] args) {

        Child c = new Child();

        c.house();
        c.car();
    }
}

// single level Inheritance