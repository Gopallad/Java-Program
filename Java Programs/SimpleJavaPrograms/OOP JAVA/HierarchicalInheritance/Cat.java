
class Animal {

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class Cat extends Animal {

    void meow() {
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {

        Dog d = new Dog();
        d.bark();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
