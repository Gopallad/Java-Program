
class Vehicle {

    final int speedLimit = 100;

    final void display() {
        System.out.println("Speed limit: " + speedLimit);
    }
}

public class FinalKeyword {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.display();

        // v.speedLimit = 120; // Error: cannot reassign final variable
    }
}
