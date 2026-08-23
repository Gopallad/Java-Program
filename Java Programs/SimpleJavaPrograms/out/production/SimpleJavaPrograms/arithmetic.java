
import java.util.Scanner;

public class arithmetic {

    static int addition(int a, int b) {
        return a + b;
    }

    static int subtraction(int a, int b) {
        return a - b;
    }

    static double multiplication(int a, int b) {
       return a * b;
    }

    static int division(int a, int b) {
       return a / b;
    }

    static int modulus(int a, int b) {
       return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the a: ");
        int a = sc.nextInt();
        System.out.println("Enter the b: ");
        int b = sc.nextInt();

        int add = addition(a, b);
        System.out.println("addition: " + add);

        int sub = subtraction(a, b);
        System.out.println("subtraction: " + sub);

        double mul = multiplication(a, b);
        System.out.println("multiplication: " + mul);

        double div = division(a, b);
        System.out.println("division: " + div);

        double mod = modulus(a, b);
        System.out.println("Mod: " + mod);
    }
}
