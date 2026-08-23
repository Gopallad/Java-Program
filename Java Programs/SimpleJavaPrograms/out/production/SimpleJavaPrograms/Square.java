
import java.util.Scanner;

public class Square {

    static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int square = square(n);
        System.out.println("Square: " + square);
    }
}
