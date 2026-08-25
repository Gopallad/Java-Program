
import java.util.Scanner;

public class FindLastDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        int digit = n % 10;
        System.out.println("Last digit: " + digit);
    }
}
