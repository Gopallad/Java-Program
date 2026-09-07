
class Vehicle {

    void start() {
        System.out.println("Vehicle Starts");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }
}

public class SportsCar extends Car {

    void speed() {
        System.out.println("Sports car is very fast");
    }

    public static void main(String[] args) {

        SportsCar c = new SportsCar();

        c.start();
        c.drive();
        c.speed();
    }
}
