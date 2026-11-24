class GrandParent {

    public void house() {
        System.out.println("GrandParent has a house");
    }
}

interface Father {
    void car();
}

class Child extends GrandParent implements Father {

    public void car() {
        System.out.println("Father has a car");
    }

    public void bike() {
        System.out.println("Child has a bike");
    }
}

public class Hybrid {

    public static void main(String[] args) {

        Child a = new Child();

        a.house();
        a.car();
        a.bike();
    }
}