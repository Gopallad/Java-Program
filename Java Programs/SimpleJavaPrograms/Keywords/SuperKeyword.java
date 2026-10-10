
class Animal {

    String name = "Animal";

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    String name = "Dog";

    void display() {
        System.out.println(super.name);
        super.sound();
    }
}

public class SuperKeyword {

    public static void main(String[] args) {
        Dog d = new Dog();

        d.display();
    }
}
