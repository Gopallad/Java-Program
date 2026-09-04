
class Rectangle {

    int length;
    int width;

    Rectangle() {
        length = 5;
        width = 5;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Area: " + (length * width));
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        Rectangle r2 = new Rectangle(10, 5);

        r1.area();
        r2.area();
    }

}
