
import java.util.Scanner;

public class AreaOfRectangle {

    static int AreaOfRectangle(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the a: ");
        int a = sc.nextInt();

        System.out.println("Enter the b: ");
        int b = sc.nextInt();

        int area = AreaOfRectangle(a, b);
        System.out.println("Area of Rectangle: " + area);

    }
}
