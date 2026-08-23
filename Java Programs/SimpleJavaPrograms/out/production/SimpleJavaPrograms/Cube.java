
import java.util.Scanner;

public class Cube {

    static int cube(int a) {
        return a * a * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        int cube = cube(a);
        System.out.println("Cube is: " + cube);

    }
}
