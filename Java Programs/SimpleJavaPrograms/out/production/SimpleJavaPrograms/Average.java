
import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number: ");
        int a = sc.nextInt();

        System.out.println("Enter the 2nd number: ");
        int b = sc.nextInt();

        System.out.println("Enter the 3rd number: ");
        int c = sc.nextInt();

        double avg = a + b + c / 3.0;
        System.out.println(avg);

    }
}
