
import java.util.Scanner;

public class PersonEligible {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for: ");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
