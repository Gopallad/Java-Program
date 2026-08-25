
import java.util.Scanner;

public class PrintPalindrome1ton {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {

            int temp = i;
            int original = i;
            int reverse = 0;

            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp = temp / 10;

            }
            if (original == reverse) {
                System.out.println(original);
            }
        }
    }
}
