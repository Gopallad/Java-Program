
class Animal {

    void eat() {
        System.out.println("Animal eat");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog bark");
    }
}

public class Puppy extends Dog {

    void play() {
        System.out.println("Puppy plays");
    }

    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();
    }
}
