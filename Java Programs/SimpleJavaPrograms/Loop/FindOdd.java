
import java.util.Scanner;

public class FindOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                System.out.println("Odd Number: " + digit + " ");
            }
            n = n / 10;
        }
    }
}
