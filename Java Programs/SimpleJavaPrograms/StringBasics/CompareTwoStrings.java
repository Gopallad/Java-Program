
import java.util.Scanner;

public class CompareTwoStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a First String: ");

        String a = sc.nextLine();

        System.out.println("Enter a Second String: ");

        String b = sc.nextLine();

        if (a.equals(b)) {
            System.out.println("Both Strings are Same: ");
        } else {
            System.out.println("Strings are different: ");
        }
    }
}
