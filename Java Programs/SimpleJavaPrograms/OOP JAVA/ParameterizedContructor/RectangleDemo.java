
class Rectangle {

    int length;
    int width;

    Rectangle() {
    }

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int area() {
        return length * width;
    }

}

public class RectangleDemo {

    public static void main(String[] args) {

        Rectangle a = new Rectangle(10, 10);

        System.out.println("Area: " + a.area());

    }
}
