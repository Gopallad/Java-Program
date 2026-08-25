
import java.util.Scanner;

public class FindLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        int largest = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > largest) {
                largest = digit;
            }
            n = n / 10;
        }
        System.out.println("Largest: " + largest);
    }
}
