
class Car {

    String brand;
    String name;
    int price;

    Car() {
        brand = "Toyota";
        name = "Fortuner";
        price = 500000;
    }

    Car(String brand, String name, int price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(brand + " " + name + " " + price);
    }

    public static void main(String[] args) {

        Car c = new Car();

        Car c1 = new Car("KTM", "DUKE200", 250000);

        c.display();
        c1.display();
    }

}
