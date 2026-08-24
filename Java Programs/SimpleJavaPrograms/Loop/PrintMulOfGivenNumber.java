
import java.util.Scanner;

public class PrintMulOfGivenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n: ");
        int num = sc.nextInt();

        System.out.println("Enter the limit: ");
        int n = sc.nextInt();

        for (int i = num; i <= n; i += num) {
            System.out.print(i + " ");
        }
    }
}
