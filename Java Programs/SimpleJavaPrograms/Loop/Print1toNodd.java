
import java.util.Scanner;

public class Print1toNodd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
