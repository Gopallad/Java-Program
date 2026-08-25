
import java.util.Scanner;

public class Automorphic {

    public static void main(String[] args) {

        System.out.println("Automorphic Number meaning the number whose square ends with the same number 25 *25 625");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        int square = n * n;

        if (square % 10 == n) {
            System.out.println("Automorphic Number: ");
        } else {
            System.out.println("Not an Automorphic Number: ");
        }

    }
}
