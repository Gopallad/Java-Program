
class A {

    void show() {
        System.out.println("Parent class");
    }
}

class B extends A {

}

class C extends A {

}

public class Hierachical {

    public static void main(String[] args) {

        B obj1 = new B();
        C obj2 = new C();

        obj1.show();
        obj2.show();
    }
}
