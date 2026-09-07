
class Animal {

    void eat() {
        System.out.println("Animal eats");
    }
}

public class Cat extends Animal {

    void meow() {
        System.out.println("Cat Says meow");
    }

    public static void main(String[] args) {

        Cat c = new Cat();
        c.meow();
        c.eat();

    }
}
