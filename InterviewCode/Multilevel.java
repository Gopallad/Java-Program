class Grandparent {

    public void house() {
        System.out.println("Grandparent has a house");
    }
}

class Parent extends Grandparent {
    public void car() {
        System.out.println("Parent has a car");
    }
}

class Child extends Parent {
    public void bike() {
        System.out.println("Child has a bike");
    }
}

public class Multilevel {
    public static void main(String[] args) {

        Child a = new Child();

        a.house();
        a.car();
        a.bike();
    }
}