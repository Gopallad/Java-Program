
import java.util.Scanner;

public class ConvertStringIntoUpper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        String upper = str.toUpperCase();

        System.out.println("Uppercase: " + upper);
    }
}
