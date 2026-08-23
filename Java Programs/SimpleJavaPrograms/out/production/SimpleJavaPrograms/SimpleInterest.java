
import java.util.Scanner;

public class SimpleInterest {

    static int simpleInterest(int p, int r, int n) {
        return p * r * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Princpal: ");
        int p = sc.nextInt();

        System.out.println("Enter the Rate of Interest: ");
        int r = sc.nextInt();

        System.out.println("Enter the year: ");
        int n = sc.nextInt();

        int simpleInterest = simpleInterest(p, r, n);
        System.out.println("SimpleInterest: " + simpleInterest);

    }
}
