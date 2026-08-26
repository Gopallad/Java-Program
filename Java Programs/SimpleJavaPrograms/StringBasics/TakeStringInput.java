
import java.util.Scanner;

public class TakeStringInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String a = sc.nextLine();

        System.out.println("Your name is: " + a);

        System.out.println("Enter your full name: ");
        String b = sc.nextLine();

        System.out.println("Your Full Name is: " + b);
    }
}
