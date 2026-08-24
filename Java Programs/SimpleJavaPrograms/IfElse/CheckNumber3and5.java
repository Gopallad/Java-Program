
import java.util.Scanner;

public class CheckNumber3and5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        if (n % 3 == 0 || n % 5 == 0) {
            System.out.println("Number is divisible by 3 and 5");
        } else {
            System.out.println("Number is not Divisible by 3 and 5");
        }
    }
}
