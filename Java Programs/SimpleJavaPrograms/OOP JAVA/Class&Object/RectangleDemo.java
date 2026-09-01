
class Rectangle {

    int length;
    int width;

    void area() {
        int result = length * width;
        System.out.println("Area: " + result);
    }
}

public class RectangleDemo {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.length = 10;
        r.width = 5;

        r.area();

    }
}
