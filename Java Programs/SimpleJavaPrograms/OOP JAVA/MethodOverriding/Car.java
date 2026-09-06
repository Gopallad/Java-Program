
class Vehicle {

    void start() {
        System.out.println("Vehicle Start");
    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts with  key");
    }

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
    }
}
