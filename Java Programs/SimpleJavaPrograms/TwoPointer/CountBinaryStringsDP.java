// Count binary strings of length N with no two consecutive 1s.
import java.util.Scanner;

public class CountBinaryStringsDP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 1;
        int b = 2;

        for (int i = 2; i <= n; i++) {
            int c = a + b;

            a = b;
            b = c;

        }
        System.out.println(b);
    }
}
