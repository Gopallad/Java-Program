
import java.util.Scanner;

public class FindLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number: ");
        int m = sc.nextInt();

        System.out.println("Enter the 2nd number: ");
        int n = sc.nextInt();

        if (m > n) {
            System.out.println("1st is greater ");
        } else {
            System.out.println("2nd is greater");
        }

    }
}
