
class Parent {

    void show() {
        System.out.println("Parent class Method");
    }
}

public class Overriding extends Parent {

    void show() {
        System.out.println("Child class Method");
    }
    public static void main(String[] args) {
        
        Overriding obj = new Overriding();

        obj.show();
    }
}
