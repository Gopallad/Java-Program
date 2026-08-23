
import java.util.Scanner;

public class swapwithoutusingthird {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the a: ");
        int a = sc.nextInt();

        System.out.println("Enter the b: ");
        int b = sc.nextInt();

        System.out.println("Before swap: ");
        System.out.println(a);
        System.out.println(b);
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap: ");
        System.out.println(a);
        System.out.println(b);
    }
}
