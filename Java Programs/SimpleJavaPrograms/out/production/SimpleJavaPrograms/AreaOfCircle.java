
import java.util.Scanner;

public class AreaOfCircle {

    static double areaofCirle(int r) {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius: ");
        int r = sc.nextInt();

        double area = areaofCirle(r);
        System.out.println("Area of Circle: " + area + " sq m");

    }
}
