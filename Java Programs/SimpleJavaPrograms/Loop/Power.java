
import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base: ");
        int base = sc.nextInt();

        System.out.println("Enter power: ");
        int power = sc.nextInt();

        int result = 1;

        while (power > 0) {
            result = result * base;
            power--;
        }
        System.out.println("Result: " + result);
    }
}
