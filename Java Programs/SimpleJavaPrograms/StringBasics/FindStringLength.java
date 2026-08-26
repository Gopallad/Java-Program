
import java.util.Scanner;

public class FindStringLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String a = sc.nextLine();

        System.out.println("Length of the string: " + a.length());
    }
}
