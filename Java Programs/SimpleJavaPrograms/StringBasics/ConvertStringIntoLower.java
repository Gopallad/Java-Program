
import java.util.Scanner;

public class ConvertStringIntoLower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        String lower = str.toLowerCase();

        System.out.println("Lowercase: " + lower);
    }
}
