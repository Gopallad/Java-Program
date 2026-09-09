
interface Vehicle {

    void start();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car starts with key");
    }
}

class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike starts with button");
    }
}

public class VehicleInterface {

    public static void main(String[] args) {
        Car c = new Car();

        c.start();

        Bike b = new Bike();

        b.start();
    }
}
