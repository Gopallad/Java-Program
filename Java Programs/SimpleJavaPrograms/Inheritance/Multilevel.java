
class A {

    void showA() {
        System.out.println("Class A");
    }
}

class B extends A {

    void showB() {
        System.out.println("Class B");
    }
}

class C extends B {

    public static void main(String[] args) {

        C obj = new C();

        obj.showA();
        obj.showB();

    }
}
