
class Animal {

    void eat() {
        System.out.println("Animal eat");
    }
}

public class Dog extends Animal {

    void bark() {
        System.out.println("Dog Bark");
    }

    public static void main(String[] args) {

        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
