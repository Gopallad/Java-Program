
class Device {

    void PowerOn() {
        System.out.println("Device is powered on");
    }
}

class Computer extends Device {

    void process() {
        System.out.println("Computer processes data");
    }
}

public class Laptop extends Computer {

    void carry() {
        System.out.println("Laptop is easy to carry");
    }

    public static void main(String[] args) {

        Laptop l = new Laptop();

        l.PowerOn();
        l.process();
        l.carry();
    }
}
