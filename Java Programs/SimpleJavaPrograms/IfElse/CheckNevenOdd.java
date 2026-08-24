
import java.util.Scanner;

public class CheckNevenOdd {

    public static void main(String[] args) {
        System.out.println("Check the Number Even or Odd");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
