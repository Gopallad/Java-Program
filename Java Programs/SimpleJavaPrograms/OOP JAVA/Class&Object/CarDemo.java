
class Car {

    String brand;
    String model;
    double price;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class CarDemo {

    public static void main(String[] args) {
        Car c = new Car();

        c.brand = "Toyota";
        c.model = "Fortuner";
        c.price = 4000000;

        c.display();
    }
}
