
import java.util.Scanner;

public class CheckSmallofThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find smallest of three number: ");

        System.out.println("Enter the 1st number: ");
        int a = sc.nextInt();

        System.out.println("Enter the 2nd number: ");
        int b = sc.nextInt();

        System.out.println("Enter the 3rd number: ");
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("1st smallest");
        } else if (b < a && b < c) {
            System.out.println("2nd is smallest");
        } else {
            System.out.println("3rd is smallest");
        }

    }
}
