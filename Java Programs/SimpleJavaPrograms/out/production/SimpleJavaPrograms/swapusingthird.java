
import java.util.Scanner;

public class swapusingthird {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the a: ");
        int a = sc.nextInt();

        System.out.println("Enter the b: ");
        int b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("without using third variable: ");
        System.out.println(a);
        System.out.println(b);

        System.out.println("Before swapping: ");
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: ");

        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);

    }
}
