
class Rectangle {

    int length;
    int width;

    Rectangle() {
        length = 10;
        width = 5;
    }

    int area() {
        return length * width;
    }
}

public class RectangleDemo {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        System.out.println("Area: " + r.area());
    }
}
