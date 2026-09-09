
abstract class Vehicle {

    void fuel() {
        System.out.println("Vehicle need fuel");
    }

    abstract void start();
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts with key");
    }

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.fuel();
    }

}
