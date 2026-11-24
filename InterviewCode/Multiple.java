interface Father {

    void car();

}

interface Mother {

    void house();
}

class Child implements Father, Mother {

    public void car() {
        System.out.println("Father has a car");
    }

    public void house() {
        System.out.println("Mother has a bike");
    }
}

public class Multiple {
    public static void main(String[] args) {

        Child c = new Child();

        c.car();
        c.house();
    }
}
