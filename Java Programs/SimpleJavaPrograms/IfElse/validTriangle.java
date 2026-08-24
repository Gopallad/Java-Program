
import java.util.Scanner;

public class validTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side a: ");
        int a = sc.nextInt();

        System.out.println("Enter the side b: ");
        int b = sc.nextInt();

        System.out.println("Enter the side c: ");
        int c = sc.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}
