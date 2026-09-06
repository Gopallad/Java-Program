
class Bird {

    void fly() {
        System.out.println("Bird can fly: ");
    }
}

class Sparrow extends Bird {

    void fly() {
        super.fly();
        System.out.println("Sparrow flies fast: ");
    }

    public static void main(String[] args) {

        Sparrow s = new Sparrow();

        s.fly();
    }
}
