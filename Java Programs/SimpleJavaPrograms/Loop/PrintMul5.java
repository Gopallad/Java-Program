
import java.util.Scanner;

public class PrintMul5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        for (int i = 5; i <= n; i += 5) {
            System.out.print(i + " ");
        }
    }
}
