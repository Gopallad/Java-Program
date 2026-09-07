
class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }
}

public class Bike extends Vehicle {

    void ride() {
        System.out.println("Bike is riding");
    }

    public static void main(String[] args) {

        Bike b = new Bike();

        b.ride();
        b.drive();

        Car c = new Car();
        c.drive();
        c.start();
    }
}
