
class Rectangle {

    int length;
    int width;

    int area() {
        return length * width;
    }
}

public class RectangleDemo {

    public static void main(String[] args) {

        Rectangle a = new Rectangle();

        a.length = 10;
        a.width = 5;

        int result = a.area();

        System.out.println(result);

    }
}
