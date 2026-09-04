
class Car {

    String brand;
    double price;

    Car() {

    }

    Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    Car(Car c) {
        this.brand = c.brand;
        this.price = c.price;
    }

    void display() {
        System.out.println(brand + " " + price);
    }

    public static void main(String[] args) {

        Car a = new Car();

        Car a1 = new Car("Honda", 600000);

        Car a2 = new Car(a1);

        a.display();
        a1.display();
        a2.display();
    }

}
