
class Car {

    String brand;
    String model;

    Car() {
        brand = "Toyota";
        model = "Fortuner";
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

public class CarDemo {

    public static void main(String[] args) {
        Car c = new Car();

        c.display();
    }
}
